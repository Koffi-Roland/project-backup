/* Delete all datas created by ROBOTFRAMEWORK */
delete from SIC2.REF_PRODUCT_COMPREF_GROUP where SSIGNATURE_MODIFICATION = 'ROBOTFRAMEWORK' and REF_COMPREF_GROUP_INFO_ID > 30000000 and REF_COMPREF_GROUP_INFO_ID < 30000003 ;
delete from SIC2.REF_PRODUCT_OWNER where SSIGNATURE_MODIFICATION = 'ROBOTFRAMEWORK' and PRODUCTID > 10000000 and PRODUCTID < 10000020  ;
delete from SIC2.REF_COMPREF_GROUP where SSIGNATURE_MODIFICATION = 'ROBOTFRAMEWORK' and REF_COMPREF_GROUP_INFO_ID > 30000000 and REF_COMPREF_GROUP_INFO_ID < 30000003;
delete from SIC2.REF_PRODUCT where SSIGNATURE_MODIFICATION = 'ROBOTFRAMEWORK' and PRODUCTID > 10000000 and PRODUCTID < 10000020;
delete from SIC2.REF_COMPREF_GROUP_INFO where SSIGNATURE_MODIFICATION = 'ROBOTFRAMEWORK' and REF_COMPREF_GROUP_INFO_ID > 30000000 and REF_COMPREF_GROUP_INFO_ID < 30000003;
commit;