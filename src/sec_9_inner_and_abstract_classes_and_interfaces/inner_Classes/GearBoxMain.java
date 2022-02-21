package sec_9_inner_and_abstract_classes_and_interfaces.inner_Classes;

public class GearBoxMain {
    public static void main(String[] args) {
        GearBox mclaren = new GearBox(6);
        mclaren.operateClutch(true);
        mclaren.changeGear(1);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(1000));
        mclaren.changeGear(2);
        System.out.println(mclaren.wheelSpeed(3000));
        mclaren.operateClutch(true);
        mclaren.changeGear(3);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(6000));

//        GearBox.Gear first = mclaren.new Gear(1, 13.2);
//        System.out.println(first.driveSpeed(1000));


    }
}
