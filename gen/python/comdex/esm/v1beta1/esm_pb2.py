# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/esm/v1beta1/esm.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x63omdex/esm/v1beta1/esm.proto\x12\x12\x63omdex.esm.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x90\x03\n\x10\x45SMTriggerParams\x12-\n\x06\x61pp_id\x18\x01 \x01(\x04\x42\x16\xe2\xde\x1f\x05\x41ppId\xf2\xde\x1f\tyaml:\"id\"R\x05\x61ppId\x12\x84\x01\n\x0ctarget_value\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBF\xc8\xde\x1f\x00\xf2\xde\x1f\x13yaml:\"target_value\"\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x0btargetValue\x12S\n\x0f\x63ool_off_period\x18\x03 \x01(\x04\x42+\xe2\xde\x1f\rCoolOffPeriod\xf2\xde\x1f\x16yaml:\"cool_off_period\"R\rcoolOffPeriod\x12q\n\x0b\x61ssetsRates\x18\x04 \x03(\x0b\x32#.comdex.esm.v1beta1.DebtAssetsRatesB*\xc8\xde\x1f\x00\xe2\xde\x1f\x0b\x41ssetsRates\xf2\xde\x1f\x13yaml:\"assets_rates\"R\x0b\x61ssetsRates\"\xbc\x01\n\x13\x43urrentDepositStats\x12-\n\x06\x61pp_id\x18\x01 \x01(\x04\x42\x16\xe2\xde\x1f\x05\x41ppId\xf2\xde\x1f\tyaml:\"id\"R\x05\x61ppId\x12v\n\x07\x62\x61lance\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBA\xc8\xde\x1f\x00\xf2\xde\x1f\x0eyaml:\"balance\"\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x07\x62\x61lance\"\xf6\x05\n\tESMStatus\x12-\n\x06\x61pp_id\x18\x01 \x01(\x04\x42\x16\xe2\xde\x1f\x05\x41ppId\xf2\xde\x1f\tyaml:\"id\"R\x05\x61ppId\x12/\n\x08\x65xecutor\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"executor\"R\x08\x65xecutor\x12)\n\x06status\x18\x03 \x01(\x08\x42\x11\xf2\xde\x1f\ryaml:\"status\"R\x06status\x12X\n\nstart_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"start_time\"\x90\xdf\x1f\x01R\tstartTime\x12R\n\x08\x65nd_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1b\xc8\xde\x1f\x00\xf2\xde\x1f\x0fyaml:\"end_time\"\x90\xdf\x1f\x01R\x07\x65ndTime\x12Z\n\x17vault_redemption_status\x18\x06 \x01(\x08\x42\"\xf2\xde\x1f\x1eyaml:\"vault_redemption_status\"R\x15vaultRedemptionStatus\x12\x42\n\x0esnapshotStatus\x18\x07 \x01(\x08\x42\x1a\xf2\xde\x1f\x16yaml:\"snapshot_status\"R\x0esnapshotStatus\x12n\n\x1estable_vault_redemption_status\x18\x08 \x01(\x08\x42)\xf2\xde\x1f%yaml:\"stable_vault_redemption_status\"R\x1bstableVaultRedemptionStatus\x12U\n\x15\x63ollector_transaction\x18\t \x01(\x08\x42 \xf2\xde\x1f\x1cyaml:\"collector_transaction\"R\x14\x63ollectorTransaction\x12I\n\x11share_calculation\x18\n \x01(\x08\x42\x1c\xf2\xde\x1f\x18yaml:\"share_calculation\"R\x10shareCalculation\"|\n\x10KillSwitchParams\x12&\n\x05\x61ppId\x18\x01 \x01(\x04\x42\x10\xf2\xde\x1f\x0cyaml:\"appId\"R\x05\x61ppId\x12@\n\x0e\x62reaker_enable\x18\x02 \x01(\x08\x42\x19\xf2\xde\x1f\x15yaml:\"breaker_enable\"R\rbreakerEnable\"\xf3\x01\n\x13UsersDepositMapping\x12-\n\x06\x61pp_id\x18\x01 \x01(\x04\x42\x16\xe2\xde\x1f\x05\x41ppId\xf2\xde\x1f\tyaml:\"id\"R\x05\x61ppId\x12\x32\n\tdepositor\x18\x02 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"depositor\"R\tdepositor\x12y\n\x08\x64\x65posits\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBB\xc8\xde\x1f\x00\xf2\xde\x1f\x0fyaml:\"deposits\"\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x08\x64\x65posits\"\xbd\x02\n\x10\x44\x61taAfterCoolOff\x12&\n\x05\x61ppId\x18\x01 \x01(\x04\x42\x10\xf2\xde\x1f\x0cyaml:\"appId\"R\x05\x61ppId\x12\x88\x01\n\x17\x63ollateral_total_amount\x18\x02 \x01(\tBP\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x1eyaml:\"collateral_total_amount\"R\x15\x63ollateralTotalAmount\x12v\n\x11\x64\x65\x62t_total_amount\x18\x03 \x01(\tBJ\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x18yaml:\"debt_total_amount\"R\x0f\x64\x65\x62tTotalAmount\"\xd5\x03\n\rAssetToAmount\x12&\n\x05\x61ppId\x18\x01 \x01(\x04\x42\x10\xf2\xde\x1f\x0cyaml:\"appId\"R\x05\x61ppId\x12\x39\n\x08\x61sset_id\x18\x02 \x01(\x04\x42\x1e\xe2\xde\x1f\x07\x41ssetID\xf2\xde\x1f\x0fyaml:\"asset_id\"R\x07\x61ssetId\x12W\n\x06\x61mount\x18\x03 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\ryaml:\"amount\"R\x06\x61mount\x12T\n\x05share\x18\x04 \x01(\tB>\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x0cyaml:\"share\"R\x05share\x12s\n\x10\x64\x65\x62t_token_worth\x18\x05 \x01(\tBI\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x17yaml:\"debt_token_worth\"R\x0e\x64\x65\x62tTokenWorth\x12=\n\ris_collateral\x18\x06 \x01(\x08\x42\x18\xf2\xde\x1f\x14yaml:\"is_collateral\"R\x0cisCollateral\"b\n\x0f\x44\x65\x62tAssetsRates\x12\x39\n\x08\x61sset_id\x18\x01 \x01(\x04\x42\x1e\xe2\xde\x1f\x07\x41ssetID\xf2\xde\x1f\x0fyaml:\"asset_id\"R\x07\x61ssetId\x12\x14\n\x05rates\x18\x02 \x01(\x04R\x05ratesB\xbb\x01\n\x16\x63om.comdex.esm.v1beta1B\x08\x45smProtoP\x01Z-github.com/comdex-official/comdex/x/esm/types\xa2\x02\x03\x43\x45X\xaa\x02\x12\x43omdex.Esm.V1beta1\xca\x02\x12\x43omdex\\Esm\\V1beta1\xe2\x02\x1e\x43omdex\\Esm\\V1beta1\\GPBMetadata\xea\x02\x14\x43omdex::Esm::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.esm.v1beta1.esm_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.comdex.esm.v1beta1B\010EsmProtoP\001Z-github.com/comdex-official/comdex/x/esm/types\242\002\003CEX\252\002\022Comdex.Esm.V1beta1\312\002\022Comdex\\Esm\\V1beta1\342\002\036Comdex\\Esm\\V1beta1\\GPBMetadata\352\002\024Comdex::Esm::V1beta1'
  _ESMTRIGGERPARAMS.fields_by_name['app_id']._options = None
  _ESMTRIGGERPARAMS.fields_by_name['app_id']._serialized_options = b'\342\336\037\005AppId\362\336\037\tyaml:\"id\"'
  _ESMTRIGGERPARAMS.fields_by_name['target_value']._options = None
  _ESMTRIGGERPARAMS.fields_by_name['target_value']._serialized_options = b'\310\336\037\000\362\336\037\023yaml:\"target_value\"\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _ESMTRIGGERPARAMS.fields_by_name['cool_off_period']._options = None
  _ESMTRIGGERPARAMS.fields_by_name['cool_off_period']._serialized_options = b'\342\336\037\rCoolOffPeriod\362\336\037\026yaml:\"cool_off_period\"'
  _ESMTRIGGERPARAMS.fields_by_name['assetsRates']._options = None
  _ESMTRIGGERPARAMS.fields_by_name['assetsRates']._serialized_options = b'\310\336\037\000\342\336\037\013AssetsRates\362\336\037\023yaml:\"assets_rates\"'
  _CURRENTDEPOSITSTATS.fields_by_name['app_id']._options = None
  _CURRENTDEPOSITSTATS.fields_by_name['app_id']._serialized_options = b'\342\336\037\005AppId\362\336\037\tyaml:\"id\"'
  _CURRENTDEPOSITSTATS.fields_by_name['balance']._options = None
  _CURRENTDEPOSITSTATS.fields_by_name['balance']._serialized_options = b'\310\336\037\000\362\336\037\016yaml:\"balance\"\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _ESMSTATUS.fields_by_name['app_id']._options = None
  _ESMSTATUS.fields_by_name['app_id']._serialized_options = b'\342\336\037\005AppId\362\336\037\tyaml:\"id\"'
  _ESMSTATUS.fields_by_name['executor']._options = None
  _ESMSTATUS.fields_by_name['executor']._serialized_options = b'\362\336\037\017yaml:\"executor\"'
  _ESMSTATUS.fields_by_name['status']._options = None
  _ESMSTATUS.fields_by_name['status']._serialized_options = b'\362\336\037\ryaml:\"status\"'
  _ESMSTATUS.fields_by_name['start_time']._options = None
  _ESMSTATUS.fields_by_name['start_time']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"start_time\"\220\337\037\001'
  _ESMSTATUS.fields_by_name['end_time']._options = None
  _ESMSTATUS.fields_by_name['end_time']._serialized_options = b'\310\336\037\000\362\336\037\017yaml:\"end_time\"\220\337\037\001'
  _ESMSTATUS.fields_by_name['vault_redemption_status']._options = None
  _ESMSTATUS.fields_by_name['vault_redemption_status']._serialized_options = b'\362\336\037\036yaml:\"vault_redemption_status\"'
  _ESMSTATUS.fields_by_name['snapshotStatus']._options = None
  _ESMSTATUS.fields_by_name['snapshotStatus']._serialized_options = b'\362\336\037\026yaml:\"snapshot_status\"'
  _ESMSTATUS.fields_by_name['stable_vault_redemption_status']._options = None
  _ESMSTATUS.fields_by_name['stable_vault_redemption_status']._serialized_options = b'\362\336\037%yaml:\"stable_vault_redemption_status\"'
  _ESMSTATUS.fields_by_name['collector_transaction']._options = None
  _ESMSTATUS.fields_by_name['collector_transaction']._serialized_options = b'\362\336\037\034yaml:\"collector_transaction\"'
  _ESMSTATUS.fields_by_name['share_calculation']._options = None
  _ESMSTATUS.fields_by_name['share_calculation']._serialized_options = b'\362\336\037\030yaml:\"share_calculation\"'
  _KILLSWITCHPARAMS.fields_by_name['appId']._options = None
  _KILLSWITCHPARAMS.fields_by_name['appId']._serialized_options = b'\362\336\037\014yaml:\"appId\"'
  _KILLSWITCHPARAMS.fields_by_name['breaker_enable']._options = None
  _KILLSWITCHPARAMS.fields_by_name['breaker_enable']._serialized_options = b'\362\336\037\025yaml:\"breaker_enable\"'
  _USERSDEPOSITMAPPING.fields_by_name['app_id']._options = None
  _USERSDEPOSITMAPPING.fields_by_name['app_id']._serialized_options = b'\342\336\037\005AppId\362\336\037\tyaml:\"id\"'
  _USERSDEPOSITMAPPING.fields_by_name['depositor']._options = None
  _USERSDEPOSITMAPPING.fields_by_name['depositor']._serialized_options = b'\362\336\037\020yaml:\"depositor\"'
  _USERSDEPOSITMAPPING.fields_by_name['deposits']._options = None
  _USERSDEPOSITMAPPING.fields_by_name['deposits']._serialized_options = b'\310\336\037\000\362\336\037\017yaml:\"deposits\"\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _DATAAFTERCOOLOFF.fields_by_name['appId']._options = None
  _DATAAFTERCOOLOFF.fields_by_name['appId']._serialized_options = b'\362\336\037\014yaml:\"appId\"'
  _DATAAFTERCOOLOFF.fields_by_name['collateral_total_amount']._options = None
  _DATAAFTERCOOLOFF.fields_by_name['collateral_total_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\036yaml:\"collateral_total_amount\"'
  _DATAAFTERCOOLOFF.fields_by_name['debt_total_amount']._options = None
  _DATAAFTERCOOLOFF.fields_by_name['debt_total_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\030yaml:\"debt_total_amount\"'
  _ASSETTOAMOUNT.fields_by_name['appId']._options = None
  _ASSETTOAMOUNT.fields_by_name['appId']._serialized_options = b'\362\336\037\014yaml:\"appId\"'
  _ASSETTOAMOUNT.fields_by_name['asset_id']._options = None
  _ASSETTOAMOUNT.fields_by_name['asset_id']._serialized_options = b'\342\336\037\007AssetID\362\336\037\017yaml:\"asset_id\"'
  _ASSETTOAMOUNT.fields_by_name['amount']._options = None
  _ASSETTOAMOUNT.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\ryaml:\"amount\"'
  _ASSETTOAMOUNT.fields_by_name['share']._options = None
  _ASSETTOAMOUNT.fields_by_name['share']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\014yaml:\"share\"'
  _ASSETTOAMOUNT.fields_by_name['debt_token_worth']._options = None
  _ASSETTOAMOUNT.fields_by_name['debt_token_worth']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\027yaml:\"debt_token_worth\"'
  _ASSETTOAMOUNT.fields_by_name['is_collateral']._options = None
  _ASSETTOAMOUNT.fields_by_name['is_collateral']._serialized_options = b'\362\336\037\024yaml:\"is_collateral\"'
  _DEBTASSETSRATES.fields_by_name['asset_id']._options = None
  _DEBTASSETSRATES.fields_by_name['asset_id']._serialized_options = b'\342\336\037\007AssetID\362\336\037\017yaml:\"asset_id\"'
  _globals['_ESMTRIGGERPARAMS']._serialized_start=140
  _globals['_ESMTRIGGERPARAMS']._serialized_end=540
  _globals['_CURRENTDEPOSITSTATS']._serialized_start=543
  _globals['_CURRENTDEPOSITSTATS']._serialized_end=731
  _globals['_ESMSTATUS']._serialized_start=734
  _globals['_ESMSTATUS']._serialized_end=1492
  _globals['_KILLSWITCHPARAMS']._serialized_start=1494
  _globals['_KILLSWITCHPARAMS']._serialized_end=1618
  _globals['_USERSDEPOSITMAPPING']._serialized_start=1621
  _globals['_USERSDEPOSITMAPPING']._serialized_end=1864
  _globals['_DATAAFTERCOOLOFF']._serialized_start=1867
  _globals['_DATAAFTERCOOLOFF']._serialized_end=2184
  _globals['_ASSETTOAMOUNT']._serialized_start=2187
  _globals['_ASSETTOAMOUNT']._serialized_end=2656
  _globals['_DEBTASSETSRATES']._serialized_start=2658
  _globals['_DEBTASSETSRATES']._serialized_end=2756
# @@protoc_insertion_point(module_scope)
