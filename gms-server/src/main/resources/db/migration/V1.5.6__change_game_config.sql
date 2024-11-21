-- 新增交易限制参数
INSERT INTO `game_config`(`config_type`, `config_sub_type`, `config_clazz`, `config_code`, `config_value`, `config_desc`) VALUES ('server', 'Game Mechanics', 'java.lang.Integer', 'trade_limit_meso_under_level', '15', '小于等于该等级的角色每天允许交易的金币将有金额限制，值为-1时则不限制等级(Characters below or equal to this level will have a limit on the amount of coins they can trade per day, while a value of -1 will not limit their level)');
INSERT INTO `game_config`(`config_type`, `config_sub_type`, `config_clazz`, `config_code`, `config_value`, `config_desc`) VALUES ('server', 'Game Mechanics', 'java.lang.Integer', 'trade_limit_meso_max', '1000000', '限制特定等级以下的角色每天允许交易的金币额度。值为-1时则不限制金额。(Limit the amount of gold coins allowed for daily transactions for characters below a specific level. When the value is -1, there is no limit on the amount.)');
INSERT INTO `game_config`(`config_type`, `config_sub_type`, `config_clazz`, `config_code`, `config_value`, `config_desc`) VALUES ('server', 'Game Mechanics', 'java.lang.Boolean', 'trade_limit_item_cash', 'false', '是否允许现金道具进行交易，需要客户端支持(Is it allowed to trade cash items? Client support is required)');
INSERT INTO `game_config`(`config_type`, `config_sub_type`, `config_clazz`, `config_code`, `config_value`, `config_desc`) VALUES ('server', 'Game Mechanics', 'java.lang.Boolean', 'trade_limit_item_nodrop', 'false', '是否允许不可丢弃道具进行交易，需要客户端支持(Whether to allow non disposable items for trading requires client support)');
