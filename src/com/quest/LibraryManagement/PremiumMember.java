package com.quest.LibraryManagement;

class PremiumMember extends Member{
    public PremiumMember(String name, String memberId) {
        super(name, memberId);
        this.borrowLimit = 3; // Premium members have a higher borrow limit
    }

    @Override
    public double calculateLateFee(final int daysLate) {
        double feePerDay = 0.5; // $0.5 per day for premium members
        return daysLate * feePerDay;
    }

    @Override
    public String toString() {
        return "PremiumMember [Name: " + super.toString() + ", Borrow Limit: " + borrowLimit + "]";
    }

}
