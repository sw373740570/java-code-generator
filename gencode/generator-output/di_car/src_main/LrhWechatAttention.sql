
INSERT INTO t_menu values('lrh_wechat_attention_list','LrhWechatAttention管理', 'business_manager', null,'/lrhwechatattention/list','1','是');
INSERT INTO t_menu values('lrh_wechat_attention_update','修改LrhWechatAttention', 'lrh_wechat_attention_list', null,'/lrhwechatattention/update','0','是');
INSERT INTO t_menu values('lrh_wechat_attention_look','查看LrhWechatAttention', 'lrh_wechat_attention_list', null,'/lrhwechatattention/look','0','是');
INSERT INTO t_menu values('lrh_wechat_attention_export','导出LrhWechatAttention', 'lrh_wechat_attention_list', null,'/lrhwechatattention/list/export','0','是');
INSERT INTO t_menu values('lrh_wechat_attention_delMulti','批量删除LrhWechatAttention', 'lrh_wechat_attention_list', null,'/lrhwechatattention/delMulti','0','是');
INSERT INTO t_menu values('lrh_wechat_attention_delete','删除LrhWechatAttention', 'lrh_wechat_attention_list', null,'/lrhwechatattention/delete','0','是');
INSERT INTO t_menu values('lrh_wechat_attention_upload','导入LrhWechatAttention', 'lrh_wechat_attention_list', null,'/lrhwechatattention/upload','0','是');
INSERT INTO `t_role_menu` VALUES ('lrh_wechat_attention_list_admin', 'admin', 'lrh_wechat_attention_list');
INSERT INTO `t_role_menu` VALUES ('lrh_wechat_attention_update_admin', 'admin', 'lrh_wechat_attention_update');
INSERT INTO `t_role_menu` VALUES ('lrh_wechat_attention_look_admin', 'admin', 'lrh_wechat_attention_look');
INSERT INTO `t_role_menu` VALUES ('lrh_wechat_attention_export_admin', 'admin', 'lrh_wechat_attention_export');
INSERT INTO `t_role_menu` VALUES ('lrh_wechat_attention_delMulti_admin', 'admin', 'lrh_wechat_attention_delMulti');
INSERT INTO `t_role_menu` VALUES ('lrh_wechat_attention_delete_admin', 'admin', 'lrh_wechat_attention_delete');
INSERT INTO `t_role_menu` VALUES ('lrh_wechat_attention_upload_admin', 'admin', 'lrh_wechat_attention_upload');
