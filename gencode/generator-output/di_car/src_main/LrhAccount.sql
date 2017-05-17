
INSERT INTO t_menu values('lrh_account_list','LrhAccount管理', 'business_manager', null,'/lrhaccount/list','1','是');
INSERT INTO t_menu values('lrh_account_update','修改LrhAccount', 'lrh_account_list', null,'/lrhaccount/update','0','是');
INSERT INTO t_menu values('lrh_account_look','查看LrhAccount', 'lrh_account_list', null,'/lrhaccount/look','0','是');
INSERT INTO t_menu values('lrh_account_export','导出LrhAccount', 'lrh_account_list', null,'/lrhaccount/list/export','0','是');
INSERT INTO t_menu values('lrh_account_delMulti','批量删除LrhAccount', 'lrh_account_list', null,'/lrhaccount/delMulti','0','是');
INSERT INTO t_menu values('lrh_account_delete','删除LrhAccount', 'lrh_account_list', null,'/lrhaccount/delete','0','是');
INSERT INTO t_menu values('lrh_account_upload','导入LrhAccount', 'lrh_account_list', null,'/lrhaccount/upload','0','是');
INSERT INTO `t_role_menu` VALUES ('lrh_account_list_admin', 'admin', 'lrh_account_list');
INSERT INTO `t_role_menu` VALUES ('lrh_account_update_admin', 'admin', 'lrh_account_update');
INSERT INTO `t_role_menu` VALUES ('lrh_account_look_admin', 'admin', 'lrh_account_look');
INSERT INTO `t_role_menu` VALUES ('lrh_account_export_admin', 'admin', 'lrh_account_export');
INSERT INTO `t_role_menu` VALUES ('lrh_account_delMulti_admin', 'admin', 'lrh_account_delMulti');
INSERT INTO `t_role_menu` VALUES ('lrh_account_delete_admin', 'admin', 'lrh_account_delete');
INSERT INTO `t_role_menu` VALUES ('lrh_account_upload_admin', 'admin', 'lrh_account_upload');
