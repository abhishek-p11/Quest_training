package com.quest.SubscriberManagmentSystem;

import java.io.*;
import java.util.ArrayList;

public class TelecomManagementSystem {
        private ArrayList<SubscriberManagement> subscribers = new ArrayList<>();
        private ArrayList<CallRecord> callRecords = new ArrayList<>();
        private static final String DATA_FILE = "file1.txt";

        // Save data to file
        public void saveData() {
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE));
                oos.writeObject(subscribers);
                oos.writeObject(callRecords);
                System.out.println("Data saved successfully.");
            } catch (IOException e) {
                System.out.println("Error saving data: " + e.getMessage());
            }
        }

        // Load data from file
        public void loadData() {
            try  {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE));
                subscribers = (ArrayList<SubscriberManagement>) ois.readObject();
                callRecords = (ArrayList<CallRecord>) ois.readObject();
                System.out.println("Data loaded successfully.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error loading data or no data found.");
            }
        }

        // Add subscriber
        public void addSubscriber(SubscriberManagement subscriber) {
            subscribers.add(subscriber);
            System.out.println("Subscriber added successfully.");
        }

        // Update balance for prepaid users
        public void updateBalance(String id, double amount) {
            for (SubscriberManagement subscriber : subscribers) {
                if (subscriber.getId().equals(id)) {
                    subscriber.setBalance(subscriber.getBalance() + amount);
                    System.out.println("Balance updated successfully.");
                    return;
                }
            }
            System.out.println("Subscriber not found.");
        }

        // List all subscribers
        public void listSubscribers() {
            System.out.println("\nSubscribers:");
            for (SubscriberManagement subscriber : subscribers) {
                System.out.println(subscriber);
            }
        }

        // Log call record
        public void logCall(String subscriberId, String callType, int duration) {
            for (SubscriberManagement subscriber : subscribers) {
                if (subscriber.getId().equals(subscriberId)) {
                    callRecords.add(new CallRecord(subscriberId, callType, duration));
                    System.out.println("Call record logged successfully.");
                    return;
                }
            }
            System.out.println("Subscriber not found.");
        }

        // Display call history for a subscriber
        public void displayCallHistory(String subscriberId) {
            System.out.println("\nCall History for Subscriber ID: " + subscriberId);
            for (CallRecord record : callRecords) {
                if (record.getSubscriberId().equals(subscriberId)) {
                    System.out.println(record);
                }
            }
        }

        // Generate bill for postpaid subscriber
        public void generateBill(String subscriberId) {
            double total = 0;
            for (SubscriberManagement subscriber : subscribers) {
                if (subscriber.getId().equals(subscriberId) && "Postpaid".equalsIgnoreCase(subscriber.getPlanType())) {
                    for (CallRecord record : callRecords) {
                        if (record.getSubscriberId().equals(subscriberId)) {
                            switch (record.getCallType()) {
                                case "Local":
                                    total += record.getDuration() * 1;
                                    break;
                                case "STD":
                                    total += record.getDuration() * 2;
                                    break;
                                case "ISD":
                                    total += record.getDuration() * 5;
                                    break;
                            }
                        }
                    }
                    System.out.println("Bill for Subscriber ID: " + subscriberId + " is ₹" + total);
                    return;
                }
            }
            System.out.println("Subscriber not found or is not postpaid.");
        }


    }
