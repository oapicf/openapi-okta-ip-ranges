@isTest
private class OASIpRangesJsonGet200ResponseValueTest {
    @isTest
    private static void equalsSameInstance() {
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue1 = OASIpRangesJsonGet200ResponseValue.getExample();
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue2 = ipRangesJsonGet200ResponseValue1;
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue3 = new OASIpRangesJsonGet200ResponseValue();
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue4 = ipRangesJsonGet200ResponseValue3;

        System.assert(ipRangesJsonGet200ResponseValue1.equals(ipRangesJsonGet200ResponseValue2));
        System.assert(ipRangesJsonGet200ResponseValue2.equals(ipRangesJsonGet200ResponseValue1));
        System.assert(ipRangesJsonGet200ResponseValue1.equals(ipRangesJsonGet200ResponseValue1));
        System.assert(ipRangesJsonGet200ResponseValue3.equals(ipRangesJsonGet200ResponseValue4));
        System.assert(ipRangesJsonGet200ResponseValue4.equals(ipRangesJsonGet200ResponseValue3));
        System.assert(ipRangesJsonGet200ResponseValue3.equals(ipRangesJsonGet200ResponseValue3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue1 = OASIpRangesJsonGet200ResponseValue.getExample();
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue2 = OASIpRangesJsonGet200ResponseValue.getExample();
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue3 = new OASIpRangesJsonGet200ResponseValue();
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue4 = new OASIpRangesJsonGet200ResponseValue();

        System.assert(ipRangesJsonGet200ResponseValue1.equals(ipRangesJsonGet200ResponseValue2));
        System.assert(ipRangesJsonGet200ResponseValue2.equals(ipRangesJsonGet200ResponseValue1));
        System.assert(ipRangesJsonGet200ResponseValue3.equals(ipRangesJsonGet200ResponseValue4));
        System.assert(ipRangesJsonGet200ResponseValue4.equals(ipRangesJsonGet200ResponseValue3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue1 = OASIpRangesJsonGet200ResponseValue.getExample();
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue2 = new OASIpRangesJsonGet200ResponseValue();

        System.assertEquals(false, ipRangesJsonGet200ResponseValue1.equals('foo'));
        System.assertEquals(false, ipRangesJsonGet200ResponseValue2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue1 = OASIpRangesJsonGet200ResponseValue.getExample();
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue2 = new OASIpRangesJsonGet200ResponseValue();
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue3;

        System.assertEquals(false, ipRangesJsonGet200ResponseValue1.equals(ipRangesJsonGet200ResponseValue3));
        System.assertEquals(false, ipRangesJsonGet200ResponseValue2.equals(ipRangesJsonGet200ResponseValue3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue1 = OASIpRangesJsonGet200ResponseValue.getExample();
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue2 = new OASIpRangesJsonGet200ResponseValue();

        System.assertEquals(ipRangesJsonGet200ResponseValue1.hashCode(), ipRangesJsonGet200ResponseValue1.hashCode());
        System.assertEquals(ipRangesJsonGet200ResponseValue2.hashCode(), ipRangesJsonGet200ResponseValue2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue1 = OASIpRangesJsonGet200ResponseValue.getExample();
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue2 = OASIpRangesJsonGet200ResponseValue.getExample();
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue3 = new OASIpRangesJsonGet200ResponseValue();
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue4 = new OASIpRangesJsonGet200ResponseValue();

        System.assert(ipRangesJsonGet200ResponseValue1.equals(ipRangesJsonGet200ResponseValue2));
        System.assert(ipRangesJsonGet200ResponseValue3.equals(ipRangesJsonGet200ResponseValue4));
        System.assertEquals(ipRangesJsonGet200ResponseValue1.hashCode(), ipRangesJsonGet200ResponseValue2.hashCode());
        System.assertEquals(ipRangesJsonGet200ResponseValue3.hashCode(), ipRangesJsonGet200ResponseValue4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue = new OASIpRangesJsonGet200ResponseValue();
        Map<String, String> x-property-mappings = ipRangesJsonGet200ResponseValue.getx-property-mappings();
        System.assertEquals('ipRanges', x-property-mappings.get('ip_ranges'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASIpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue = new OASIpRangesJsonGet200ResponseValue();
        System.assertEquals(new List<String>(), ipRangesJsonGet200ResponseValue.ipRanges);
    }
}
