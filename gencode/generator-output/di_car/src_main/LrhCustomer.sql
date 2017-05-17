
INSERT INTO t_menu values('lrh_customer_list','LrhCustomer管理', 'business_manager', null,'/lrhcustomer/list','1','是');
INSERT INTO t_menu values('lrh_customer_update','修改LrhCustomer', 'lrh_customer_list', null,'/lrhcustomer/update','0','是');
INSERT INTO t_menu values('lrh_customer_look','查看LrhCustomer', 'lrh_customer_list', null,'/lrhcustomer/look','0','是');
INSERT INTO t_menu values('lrh_customer_export','导出LrhCustomer', 'lrh_customer_list', null,'/lrhcustomer/list/export','0','是');
INSERT INTO t_menu values('lrh_customer_delMulti','批量删除LrhCustomer', 'lrh_customer_list', null,'/lrhcustomer/delMulti','0','是');
INSERT INTO t_menu values('lrh_customer_delete','删除LrhCustomer', 'lrh_customer_list', null,'/lrhcustomer/delete','0','是');
INSERT INTO t_menu values('lrh_customer_upload','导入LrhCustomer', 'lrh_customer_list', null,'/lrhcustomer/upload','0','是');
INSERT INTO `t_role_menu` VALUES ('lrh_customer_list_admin', 'admin', 'lrh_customer_list');
INSERT INTO `t_role_menu` VALUES ('lrh_customer_update_admin', 'admin', 'lrh_customer_update');
INSERT INTO `t_role_menu` VALUES ('lrh_customer_look_admin', 'admin', 'lrh_customer_look');
INSERT INTO `t_role_menu` VALUES ('lrh_customer_export_admin', 'admin', 'lrh_customer_export');
INSERT INTO `t_role_menu` VALUES ('lrh_customer_delMulti_admin', 'admin', 'lrh_customer_delMulti');
INSERT INTO `t_role_menu` VALUES ('lrh_customer_delete_admin', 'admin', 'lrh_customer_delete');
INSERT INTO `t_role_menu` VALUES ('lrh_customer_upload_admin', 'admin', 'lrh_customer_upload');
