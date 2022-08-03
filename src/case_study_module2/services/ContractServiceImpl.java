package case_study_module2.services;

import case_study_module2.models.Booking;
import case_study_module2.models.Contract;

import java.io.*;
import java.util.*;

public class ContractServiceImpl implements ContractService {
    public static Stack<Booking> bookingNeedCreateContract = new Stack<>();
    public static Queue<Contract> contractQueue = new LinkedList<>();
    public static final String pathFileContract = "E:\\A0322I1_TranThanhNghia_Module2\\src\\case_study_module2\\data\\Contract.CSV";
    static {
        try {
            readFileContract();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    public static void readFileContract() throws FileNotFoundException {
        FileReader fileReader = new FileReader(pathFileContract);
        BufferedReader bufferedReader =new BufferedReader(fileReader);
        String line;
        String temp[];
        Contract contract;
        try {
            while ((line = bufferedReader.readLine())!=null) {
                temp = line.split(",");
                String contractNumber = temp[0];
                String bookingID = temp[1];
                long depositAmount = Long.parseLong(temp[2]);
                long amountNeedPay = Long.parseLong(temp[3]);
                String customID = temp[4];
                contract = new Contract(contractNumber,bookingID,depositAmount,amountNeedPay,customID);
                contractQueue.add(contract);
            }
        } catch (IOException e) {
            System.out.println("Lỗi nhập xuất");
        }
    }

    public static void writeFileContract() throws IOException {
        FileWriter fileWriter = new FileWriter(pathFileContract);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Contract contract : contractQueue) {
            bufferedWriter.write(contract.getContractNumber() +","+ contract.getBookingID()+","+
                    contract.getDepositAmount()+","+ contract.getAmountNeedPay()+","+
                    contract.getCustomID());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    @Override
    public void addNewContract() {
        Set<Booking> keys = BookingServiceImpl.bookingTreeMap.keySet();
        for (Booking key : keys) {
            if (key.getServiceID().matches("^SVHO\\d{4}$") || key.getServiceID().matches("^SVVL\\d{4}$")) {
                boolean wasExisted = false;
                for (Contract contract : contractQueue) {
                    if (key.getBookingID().equals(contract.getBookingID())) {
                        wasExisted = true;
                    }
                }
                if (!wasExisted) {
                    bookingNeedCreateContract.push(key);
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        String contractNumber,bookingID,customID;
        long depositAmount,amountNeedPay;
        while (!bookingNeedCreateContract.isEmpty()) {
            Booking booking = bookingNeedCreateContract.pop();
            System.out.println("Chúng ta có mã booking "+booking.getBookingID()+" cần phải được tạo hợp đồng.");
            System.out.println(booking);
            System.out.print("\nNhập vào số hợp đồng : ");
            contractNumber = scanner.nextLine();
            bookingID = booking.getBookingID();
            System.out.print("Nhập vào số tiền đã cọc : ");
            depositAmount = Long.parseLong(scanner.nextLine());
            System.out.print("Nhập vào tổng tiền phải thanh toán : ");
            amountNeedPay = Long.parseLong(scanner.nextLine());
            customID = booking.getCustomID();
            Contract createContract = new Contract(contractNumber,bookingID,depositAmount,amountNeedPay,customID);
            contractQueue.add(createContract);
            try {
                ContractServiceImpl.writeFileContract();
            } catch (IOException e) {
                System.out.println("Lỗi nhập xuất");
            }
            System.out.println("Đã tạo hợp đồng thành công.");
        }
    }

    @Override
    public void editContract() {
        System.out.println("Nhập vào số hợp đồng để chỉnh sửa hợp đồng : ");
        Scanner scanner = new Scanner(System.in);
        String contractNumber,customID,bookingID;
        long depositAmount, amountNeedPay;
        contractNumber = scanner.nextLine();
        boolean isExist = false;
        int index = 0;
        Contract[] listContract = new Contract[contractQueue.size()];
        Contract contractEdit;
        for (Contract contract : contractQueue) {
            listContract[index++] = contract;
        }
        for (Contract contract : contractQueue) {
            if (contract.getContractNumber().equals(contractNumber)) {
                System.out.print("Chỉnh sửa tiền cọc : ");
                depositAmount = Long.parseLong(scanner.nextLine());
                System.out.printf("Chỉnh sửa số tiền cần trả : ");
                amountNeedPay = Long.parseLong(scanner.nextLine());
                customID =contract.getCustomID();
                bookingID = contract.getBookingID();
                contractEdit = new Contract(contractNumber,bookingID,depositAmount,amountNeedPay,customID);
                contractQueue.clear();
                for (Contract checkContract : listContract) {
                    if (checkContract.getContractNumber().equals(contractEdit.getContractNumber())) {
                        checkContract = contractEdit;
                    }
                    contractQueue.add(checkContract);
                }
                break;
            }
        }
        try {
            ContractServiceImpl.writeFileContract();
        } catch (IOException e) {
            System.out.printf("Lỗi nhập xuất");
        }
    }

    @Override
    public void displayContract() {
        for (Contract contract : contractQueue) {
            System.out.println(contract);
        }
    }
}
