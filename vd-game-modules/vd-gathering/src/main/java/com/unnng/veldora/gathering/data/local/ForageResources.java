package com.unnng.veldora.gathering.data.local;

import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.gathering.entity.Forage;

import java.util.ArrayList;
import java.util.List;

public class ForageResources {
    public static List<Forage> forageList = new ArrayList<>();

    static {

        // 白色（普通） - 废弃物和低价值植物，30种
        forageList.add(new Forage(1, "枯叶", Rarity.COMMON, 2.0, "干枯的树叶，无甚用途，常见于森林地面。"));
        forageList.add(new Forage(2, "烂果", Rarity.COMMON, 1.5, "腐烂的水果，散发酸臭气味。"));
        forageList.add(new Forage(3, "断枝", Rarity.COMMON, 2.5, "折断的树枝，毫无价值。"));
        forageList.add(new Forage(4, "干草", Rarity.COMMON, 3.0, "干燥的草束，常见于草原。"));
        forageList.add(new Forage(5, "碎树皮", Rarity.COMMON, 2.0, "剥落的树皮，偶尔用于燃料。"));
        forageList.add(new Forage(6, "霉菌块", Rarity.COMMON, 1.0, "发霉的菌类，无人问津。"));
        forageList.add(new Forage(7, "枯草根", Rarity.COMMON, 1.5, "干枯的草根，毫无药用价值。"));
        forageList.add(new Forage(8, "破损的花瓣", Rarity.COMMON, 2.0, "凋零的花瓣，失去色彩。"));
        forageList.add(new Forage(9, "腐木屑", Rarity.COMMON, 1.5, "腐烂的木屑，森林中的废弃物。"));
        forageList.add(new Forage(10, "虫蛀的叶子", Rarity.COMMON, 1.0, "被虫子咬过的叶子，无用。"));
        forageList.add(new Forage(11, "蒲公英", Rarity.COMMON, 15.0, "常见草本，用于药茶，价值较低。"));
        forageList.add(new Forage(12, "野菊花", Rarity.COMMON, 12.0, "普通野花，常见于草原。"));
        forageList.add(new Forage(13, "车前草", Rarity.COMMON, 10.0, "常见草本，药用价值低。"));
        forageList.add(new Forage(14, "狗尾草", Rarity.COMMON, 8.0, "草原常见植物，适合喂食牲畜。"));
        forageList.add(new Forage(15, "荠菜", Rarity.COMMON, 12.0, "可食用野菜，价值一般。"));
        forageList.add(new Forage(16, "马齿苋", Rarity.COMMON, 10.0, "耐旱野菜，常见于荒地。"));
        forageList.add(new Forage(17, "苜蓿", Rarity.COMMON, 15.0, "草原牧草，适合饲料。"));
        forageList.add(new Forage(18, "苦菜", Rarity.COMMON, 12.0, "苦味野菜，药用价值低。"));
        forageList.add(new Forage(19, "野蒜", Rarity.COMMON, 14.0, "带有蒜香的野菜，价值一般。"));
        forageList.add(new Forage(20, "婆婆纳", Rarity.COMMON, 10.0, "常见草本，略有药用价值。"));
        forageList.add(new Forage(21, "艾草", Rarity.COMMON, 15.0, "常见草药，用于驱虫。"));
        forageList.add(new Forage(22, "野薄荷", Rarity.COMMON, 18.0, "清香草本，略有药用价值。"));
        forageList.add(new Forage(23, "酢浆草", Rarity.COMMON, 10.0, "酸味草本，常见于森林。"));
        forageList.add(new Forage(24, "野苋菜", Rarity.COMMON, 12.0, "可食用野菜，价值普通。"));
        forageList.add(new Forage(25, "灰菜", Rarity.COMMON, 10.0, "普通野菜，适合烹饪。"));
        forageList.add(new Forage(26, "野葱", Rarity.COMMON, 14.0, "带有葱香的野菜，价值一般。"));
        forageList.add(new Forage(27, "地丁", Rarity.COMMON, 12.0, "小型草本，略有药用价值。"));
        forageList.add(new Forage(28, "野芹菜", Rarity.COMMON, 15.0, "可食用野菜，常见于湿地。"));
        forageList.add(new Forage(29, "禾本科杂草", Rarity.COMMON, 8.0, "普通杂草，适合堆肥。"));
        forageList.add(new Forage(30, "白茅", Rarity.COMMON, 10.0, "草原常见草，适合编织。"));

        // 绿色（普通） - 常见现实植物，30种
        forageList.add(new Forage(31, "薰衣草", Rarity.UNCOMMON, 30.0, "常见草本，广泛用于香料和药材。"));
        forageList.add(new Forage(32, "薄荷", Rarity.UNCOMMON, 60.0, "清香植物，市场需求高，可用于合成。"));
        forageList.add(new Forage(33, "月桂叶", Rarity.UNCOMMON, 20.0, "常见香料，适合烹饪和药剂。"));
        forageList.add(new Forage(34, "迷迭香", Rarity.UNCOMMON, 50.0, "芳香植物，用于仪式和药材。"));
        forageList.add(new Forage(35, "金盏花", Rarity.UNCOMMON, 40.0, "常见花卉，药用价值高。"));
        forageList.add(new Forage(36, "洋甘菊", Rarity.UNCOMMON, 50.0, "舒缓草药，用于茶和药剂。"));
        forageList.add(new Forage(37, "芦荟", Rarity.UNCOMMON, 70.0, "多肉植物，用于药膏和化妆品。"));
        forageList.add(new Forage(38, "当归", Rarity.UNCOMMON, 140.0, "高档药材，用于补血药剂。"));
        forageList.add(new Forage(39, "茯苓", Rarity.UNCOMMON, 150.0, "高档药材，用于滋补药剂。"));
        forageList.add(new Forage(40, "黄芪", Rarity.UNCOMMON, 120.0, "常见药材，增强体力。"));
        forageList.add(new Forage(41, "甘草", Rarity.UNCOMMON, 50.0, "甜味草药，用于药剂调和。"));
        forageList.add(new Forage(42, "罗汉果", Rarity.UNCOMMON, 80.0, "甜味果实，用于药茶。"));
        forageList.add(new Forage(43, "决明子", Rarity.UNCOMMON, 60.0, "草本种子，药用价值高。"));
        forageList.add(new Forage(44, "枸杞", Rarity.UNCOMMON, 70.0, "红色果实，滋补药材。"));
        forageList.add(new Forage(45, "桑葚", Rarity.UNCOMMON, 50.0, "甜美果实，可食用或酿酒。"));
        forageList.add(new Forage(46, "野莓", Rarity.UNCOMMON, 40.0, "森林常见浆果，适合烹饪。"));
        forageList.add(new Forage(47, "松子", Rarity.UNCOMMON, 60.0, "松树种子，营养丰富。"));
        forageList.add(new Forage(48, "板栗", Rarity.UNCOMMON, 50.0, "森林常见坚果，可食用。"));
        forageList.add(new Forage(49, "香菇", Rarity.UNCOMMON, 70.0, "食用菌类，市场需求高。"));
        forageList.add(new Forage(50, "木耳", Rarity.UNCOMMON, 60.0, "常见菌类，适合烹饪。"));
        forageList.add(new Forage(51, "竹笋", Rarity.UNCOMMON, 50.0, "竹林特产，鲜嫩可口。"));
        forageList.add(new Forage(52, "牛蒡", Rarity.UNCOMMON, 40.0, "根茎植物，药用价值高。"));
        forageList.add(new Forage(53, "蒲公英根", Rarity.UNCOMMON, 30.0, "蒲公英的根部，药用价值中等。"));
        forageList.add(new Forage(54, "紫花苜蓿", Rarity.UNCOMMON, 35.0, "草原植物，适合药用和饲料。"));
        forageList.add(new Forage(55, "金银花", Rarity.UNCOMMON, 60.0, "清热解毒的草药，市场需求高。"));
        forageList.add(new Forage(56, "连翘", Rarity.UNCOMMON, 50.0, "药用植物，用于清热。"));
        forageList.add(new Forage(57, "野玫瑰果", Rarity.UNCOMMON, 40.0, "富含维生素的果实。"));
        forageList.add(new Forage(58, "鼠尾草", Rarity.UNCOMMON, 50.0, "芳香草本，用于仪式和药剂。"));
        forageList.add(new Forage(59, "桉树叶", Rarity.UNCOMMON, 40.0, "清香树叶，药用价值中等。"));
        forageList.add(new Forage(60, "榛子", Rarity.UNCOMMON, 50.0, "森林坚果，营养丰富。"));

        // 蓝色（稀有） - 珍稀现实植物，30种
        forageList.add(new Forage(61, "雪莲", Rarity.RARE, 300.0, "稀有高山植物，药效强大。"));
        forageList.add(new Forage(62, "藏红花", Rarity.RARE, 350.0, "稀有香料，产量极低，价值极高。"));
        forageList.add(new Forage(63, "曼陀罗", Rarity.RARE, 250.0, "稀有毒草，用于特殊药剂。"));
        forageList.add(new Forage(64, "紫罗兰", Rarity.RARE, 280.0, "稀有花卉，香气迷人。"));
        forageList.add(new Forage(65, "灵芝", Rarity.RARE, 320.0, "珍贵药材，传说有长寿功效。"));
        forageList.add(new Forage(66, "人参", Rarity.RARE, 350.0, "高档药材，生长周期长。"));
        forageList.add(new Forage(67, "天麻", Rarity.RARE, 300.0, "稀有药材，用于镇静药剂。"));
        forageList.add(new Forage(68, "鹿茸", Rarity.RARE, 320.0, "珍稀药材，滋补效果极佳。"));
        forageList.add(new Forage(69, "冬虫夏草", Rarity.RARE, 400.0, "珍稀菌类，药用价值极高。"));
        forageList.add(new Forage(70, "松露", Rarity.RARE, 350.0, "地下珍稀菌类，美食珍品。"));
        forageList.add(new Forage(71, "石斛", Rarity.RARE, 300.0, "稀有兰科植物，滋阴药材。"));
        forageList.add(new Forage(72, "黄连", Rarity.RARE, 280.0, "苦味药材，清热解毒。"));
        forageList.add(new Forage(73, "何首乌", Rarity.RARE, 320.0, "滋补药材，传说可乌发。"));
        forageList.add(new Forage(74, "三七", Rarity.RARE, 300.0, "珍稀药材，用于止血活血。"));
        forageList.add(new Forage(75, "丹参", Rarity.RARE, 280.0, "药用根茎，促进血液循环。"));
        forageList.add(new Forage(76, "红景天", Rarity.RARE, 300.0, "高山药材，增强耐力。"));
        forageList.add(new Forage(77, "野生蓝莓", Rarity.RARE, 250.0, "稀有浆果，富含抗氧化物。"));
        forageList.add(new Forage(78, "黑枸杞", Rarity.RARE, 280.0, "稀有果实，滋补效果强。"));
        forageList.add(new Forage(79, "羊肚菌", Rarity.RARE, 320.0, "珍稀食用菌，味道鲜美。"));
        forageList.add(new Forage(80, "鸡枞菌", Rarity.RARE, 300.0, "稀有菌类，香气浓郁。"));
        forageList.add(new Forage(81, "茯苓", Rarity.RARE, 280.0, "珍稀药材，滋补脾胃。"));
        forageList.add(new Forage(82, "野生山药", Rarity.RARE, 270.0, "可食用根茎，滋补效果佳。"));
        forageList.add(new Forage(83, "杜仲", Rarity.RARE, 300.0, "树皮药材，强筋健骨。"));
        forageList.add(new Forage(84, "肉苁蓉", Rarity.RARE, 320.0, "沙漠药材，滋补肾阳。"));
        forageList.add(new Forage(85, "沙棘", Rarity.RARE, 250.0, "酸甜果实，富含维生素。"));
        forageList.add(new Forage(86, "野生蜂蜜", Rarity.RARE, 300.0, "天然蜂蜜，甜美且药用。"));
        forageList.add(new Forage(87, "银杏果", Rarity.RARE, 280.0, "稀有坚果，药用价值高。"));
        forageList.add(new Forage(88, "西洋参", Rarity.RARE, 320.0, "滋补药材，适合长期服用。"));
        forageList.add(new Forage(89, "玉竹", Rarity.RARE, 280.0, "滋阴药材，生长于森林。"));
        forageList.add(new Forage(90, "百合", Rarity.RARE, 300.0, "药用花卉，滋润肺部。"));

        // 紫色（史诗） - 珍稀奇幻植物，20种
        forageList.add(new Forage(91, "碧玺花", Rarity.EPIC, 1000.0, "史诗花卉，晶莹剔透，深受贵族喜爱。"));
        forageList.add(new Forage(92, "火焰蘑菇", Rarity.EPIC, 1100.0, "史诗菌类，散发微光，极难采摘。"));
        forageList.add(new Forage(93, "星辉草", Rarity.EPIC, 1050.0, "史诗植物，夜间发光，用于高级药剂。"));
        forageList.add(new Forage(94, "血莲", Rarity.EPIC, 1150.0, "史诗花卉，传说吸食鲜血生长。"));
        forageList.add(new Forage(95, "月光藤", Rarity.EPIC, 1000.0, "史诗藤蔓，仅在月光下生长。"));
        forageList.add(new Forage(96, "水晶兰", Rarity.EPIC, 1100.0, "史诗植物，通体透明如水晶。"));
        forageList.add(new Forage(97, "雷霆花", Rarity.EPIC, 1050.0, "史诗花卉，风暴中绽放。"));
        forageList.add(new Forage(98, "冰霜果", Rarity.EPIC, 1000.0, "史诗果实，寒气逼人。"));
        forageList.add(new Forage(99, "幽魂草", Rarity.EPIC, 1100.0, "史诗草本，散发幽光，生长于墓地。"));
        forageList.add(new Forage(100, "紫晶蘑菇", Rarity.EPIC, 1150.0, "史诗菌类，蘑菇如紫水晶。"));
        forageList.add(new Forage(101, "龙涎花", Rarity.EPIC, 1000.0, "史诗花卉，散发龙的气息。"));
        forageList.add(new Forage(102, "星光果", Rarity.EPIC, 1100.0, "史诗果实，夜晚闪烁光芒。"));
        forageList.add(new Forage(103, "琥珀树脂", Rarity.EPIC, 1050.0, "史诗树脂，封存古老力量。"));
        forageList.add(new Forage(104, "风铃草", Rarity.EPIC, 1150.0, "史诗草本，随风发出清脆声响。"));
        forageList.add(new Forage(105, "寒霜藤", Rarity.EPIC, 1000.0, "史诗藤蔓，生长于冰冷森林。"));
        forageList.add(new Forage(106, "烈焰花", Rarity.EPIC, 1100.0, "史诗花卉，似火焰般燃烧。"));
        forageList.add(new Forage(107, "灵光菌", Rarity.EPIC, 1050.0, "史诗菌类，散发灵性光芒。"));
        forageList.add(new Forage(108, "翡翠叶", Rarity.EPIC, 1150.0, "史诗树叶，如翡翠般晶莹。"));
        forageList.add(new Forage(109, "夜影花", Rarity.EPIC, 1000.0, "史诗花卉，仅在深夜开放。"));
        forageList.add(new Forage(110, "星辰根", Rarity.EPIC, 1100.0, "史诗根茎，蕴含星光能量。"));

        // 橙色（传说） - 虚拟植物，7种
        forageList.add(new Forage(111, "虚空藤", Rarity.LEGENDARY, 2500.0, "传说植物，能吸收星光，采集难度极高。"));
        forageList.add(new Forage(112, "幻光果", Rarity.LEGENDARY, 2800.0, "传说果实，食用后可短暂隐身。"));
        forageList.add(new Forage(113, "星魂花", Rarity.LEGENDARY, 2600.0, "传说花卉，蕴含星魂之力。"));
        forageList.add(new Forage(114, "永恒之树", Rarity.LEGENDARY, 3000.0, "传说树木，永不凋零的枝叶。"));
        forageList.add(new Forage(115, "龙焰草", Rarity.LEGENDARY, 2700.0, "传说草本，散发龙焰气息。"));
        forageList.add(new Forage(116, "暗影兰", Rarity.LEGENDARY, 2600.0, "传说花卉，生长于黑暗之地。"));
        forageList.add(new Forage(117, "天辉果", Rarity.LEGENDARY, 2900.0, "传说果实，散发神圣光芒。"));

        // 彩色（至臻传说） - 终极虚拟植物，3种
        forageList.add(new Forage(118, "星河之花", Rarity.MYTHIC, 5000.0, "至臻传说花卉，绽放如银河般光芒。"));
        forageList.add(new Forage(119, "虚空灵芝", Rarity.MYTHIC, 5500.0, "至臻传说菌类，蕴含空间之力。"));
        forageList.add(new Forage(120, "永恒生命树", Rarity.MYTHIC, 6000.0, "至臻传说树木，传说为生命之源。"));

    }
}
