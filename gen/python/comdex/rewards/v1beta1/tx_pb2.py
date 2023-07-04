# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/rewards/v1beta1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from comdex.rewards.v1beta1 import gauge_pb2 as comdex_dot_rewards_dot_v1beta1_dot_gauge__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1f\x63omdex/rewards/v1beta1/tx.proto\x12\x16\x63omdex.rewards.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\"comdex/rewards/v1beta1/gauge.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xd7\x04\n\x0eMsgCreateGauge\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12\"\n\rgauge_type_id\x18\x02 \x01(\x04R\x0bgaugeTypeId\x12\x87\x01\n\x10trigger_duration\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationBA\xc8\xde\x1f\x00\xea\xde\x1f\x1atrigger_duration,omitempty\xf2\xde\x1f\x17yaml:\"trigger_duration\"\x98\xdf\x1f\x01R\x0ftriggerDuration\x12q\n\x0e\x64\x65posit_amount\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\rdepositAmount\x12%\n\x0etotal_triggers\x18\x05 \x01(\x04R\rtotalTriggers\x12X\n\nstart_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"start_time\"\x90\xdf\x1f\x01R\tstartTime\x12_\n\x13liquidity_meta_data\x18\x07 \x01(\x0b\x32-.comdex.rewards.v1beta1.LiquidtyGaugeMetaDataH\x00R\x11liquidityMetaData\x12\x15\n\x06\x61pp_id\x18\x08 \x01(\x04R\x05\x61ppIdB\x06\n\x04kind\"\x18\n\x16MsgCreateGaugeResponse\"\xa6\x01\n\x0eWhitelistAsset\x12?\n\x0e\x61pp_mapping_id\x18\x01 \x01(\x04\x42\x19\xf2\xde\x1f\x15yaml:\"app_mapping_id\"R\x0c\x61ppMappingId\x12#\n\x04\x66rom\x18\x02 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12.\n\x08\x61sset_id\x18\x03 \x01(\x04\x42\x13\xf2\xde\x1f\x0fyaml:\"asset_id\"R\x07\x61ssetId\"\xac\x01\n\x14RemoveWhitelistAsset\x12?\n\x0e\x61pp_mapping_id\x18\x01 \x01(\x04\x42\x19\xf2\xde\x1f\x15yaml:\"app_mapping_id\"R\x0c\x61ppMappingId\x12#\n\x04\x66rom\x18\x02 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12.\n\x08\x61sset_id\x18\x03 \x01(\x04\x42\x13\xf2\xde\x1f\x0fyaml:\"asset_id\"R\x07\x61ssetId\"\x1b\n\x19MsgWhitelistAssetResponse\"!\n\x1fMsgRemoveWhitelistAssetResponse\"\x81\x01\n\x13WhitelistAppIdVault\x12\x45\n\x0e\x61pp_mapping_id\x18\x01 \x01(\x04\x42\x1f\xf2\xde\x1f\x1byaml:\"app_mapping_id_vault\"R\x0c\x61ppMappingId\x12#\n\x04\x66rom\x18\x02 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\"\x87\x01\n\x19RemoveWhitelistAppIdVault\x12\x45\n\x0e\x61pp_mapping_id\x18\x01 \x01(\x04\x42\x1f\xf2\xde\x1f\x1byaml:\"app_mapping_id_vault\"R\x0c\x61ppMappingId\x12#\n\x04\x66rom\x18\x02 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\" \n\x1eMsgWhitelistAppIdVaultResponse\"&\n$MsgRemoveWhitelistAppIdVaultResponse\"\xe9\x03\n\x1e\x41\x63tivateExternalRewardsLockers\x12?\n\x0e\x61pp_mapping_id\x18\x01 \x01(\x04\x42\x19\xf2\xde\x1f\x15yaml:\"app_mapping_id\"R\x0c\x61ppMappingId\x12.\n\x08\x61sset_id\x18\x02 \x01(\x04\x42\x13\xf2\xde\x1f\x0fyaml:\"asset_id\"R\x07\x61ssetId\x12\x87\x01\n\rtotal_rewards\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBG\xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"total_rewards\"\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x0ctotalRewards\x12=\n\rduration_days\x18\x04 \x01(\x03\x42\x18\xf2\xde\x1f\x14yaml:\"duration_days\"R\x0c\x64urationDays\x12\x32\n\tdepositor\x18\x05 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"depositor\"R\tdepositor\x12Y\n\x17min_lockup_time_seconds\x18\x06 \x01(\x03\x42\"\xf2\xde\x1f\x1eyaml:\"min_lockup_time_seconds\"R\x14minLockupTimeSeconds\"(\n&ActivateExternalRewardsLockersResponse\"\xfe\x03\n\x1c\x41\x63tivateExternalRewardsVault\x12?\n\x0e\x61pp_mapping_id\x18\x01 \x01(\x04\x42\x19\xf2\xde\x1f\x15yaml:\"app_mapping_id\"R\x0c\x61ppMappingId\x12\x45\n\x10\x65xtended_pair_id\x18\x02 \x01(\x04\x42\x1b\xf2\xde\x1f\x17yaml:\"extended_Pair_id\"R\x0e\x65xtendedPairId\x12\x87\x01\n\rtotal_rewards\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBG\xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"total_rewards\"\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x0ctotalRewards\x12=\n\rduration_days\x18\x04 \x01(\x03\x42\x18\xf2\xde\x1f\x14yaml:\"duration_days\"R\x0c\x64urationDays\x12\x32\n\tdepositor\x18\x05 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"depositor\"R\tdepositor\x12Y\n\x17min_lockup_time_seconds\x18\x06 \x01(\x03\x42\"\xf2\xde\x1f\x1eyaml:\"min_lockup_time_seconds\"R\x14minLockupTimeSeconds\"&\n$ActivateExternalRewardsVaultResponse\"\xe4\x05\n\x1b\x41\x63tivateExternalRewardsLend\x12?\n\x0e\x61pp_mapping_id\x18\x01 \x01(\x04\x42\x19\xf2\xde\x1f\x15yaml:\"app_mapping_id\"R\x0c\x61ppMappingId\x12\x30\n\tc_pool_id\x18\x02 \x01(\x04\x42\x14\xf2\xde\x1f\x10yaml:\"c_pool_id\"R\x07\x63PoolId\x12.\n\x08\x61sset_id\x18\x03 \x03(\x04\x42\x13\xf2\xde\x1f\x0fyaml:\"asset_id\"R\x07\x61ssetId\x12;\n\rc_swap_app_id\x18\x04 \x01(\x04\x42\x18\xf2\xde\x1f\x14yaml:\"c_swap_app_id\"R\ncSwapAppId\x12L\n\x16\x63_swap_min_lock_amount\x18\x05 \x01(\x04\x42\x18\xf2\xde\x1f\x14yaml:\"c_swap_app_id\"R\x12\x63SwapMinLockAmount\x12\x87\x01\n\rtotal_rewards\x18\x06 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBG\xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"total_rewards\"\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x0ctotalRewards\x12?\n\x0emaster_pool_id\x18\x07 \x01(\x03\x42\x19\xf2\xde\x1f\x15yaml:\"master_pool_id\"R\x0cmasterPoolId\x12=\n\rduration_days\x18\x08 \x01(\x03\x42\x18\xf2\xde\x1f\x14yaml:\"duration_days\"R\x0c\x64urationDays\x12Y\n\x17min_lockup_time_seconds\x18\t \x01(\x03\x42\"\xf2\xde\x1f\x1eyaml:\"min_lockup_time_seconds\"R\x14minLockupTimeSeconds\x12\x32\n\tdepositor\x18\n \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"depositor\"R\tdepositor\"%\n#ActivateExternalRewardsLendResponse\"\x9c\x04\n!ActivateExternalRewardsStableMint\x12(\n\x06\x61pp_id\x18\x01 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12\x39\n\x0c\x63swap_app_id\x18\x02 \x01(\x04\x42\x17\xf2\xde\x1f\x13yaml:\"cswap_app_id\"R\ncswapAppId\x12?\n\x0e\x63ommodo_app_id\x18\x03 \x01(\x04\x42\x19\xf2\xde\x1f\x15yaml:\"commodo_app_id\"R\x0c\x63ommodoAppId\x12\x87\x01\n\rtotal_rewards\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBG\xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"total_rewards\"\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x0ctotalRewards\x12=\n\rduration_days\x18\x05 \x01(\x03\x42\x18\xf2\xde\x1f\x14yaml:\"duration_days\"R\x0c\x64urationDays\x12\x32\n\tdepositor\x18\x06 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"depositor\"R\tdepositor\x12T\n\x15\x61\x63\x63\x65pted_block_height\x18\x07 \x01(\x03\x42 \xf2\xde\x1f\x1cyaml:\"accepted_block_height\"R\x13\x61\x63\x63\x65ptedBlockHeight\"+\n)ActivateExternalRewardsStableMintResponse2\xb2\x05\n\x03Msg\x12\x65\n\x0b\x43reateGauge\x12&.comdex.rewards.v1beta1.MsgCreateGauge\x1a..comdex.rewards.v1beta1.MsgCreateGaugeResponse\x12\x90\x01\n\x16\x45xternalRewardsLockers\x12\x36.comdex.rewards.v1beta1.ActivateExternalRewardsLockers\x1a>.comdex.rewards.v1beta1.ActivateExternalRewardsLockersResponse\x12\x8a\x01\n\x14\x45xternalRewardsVault\x12\x34.comdex.rewards.v1beta1.ActivateExternalRewardsVault\x1a<.comdex.rewards.v1beta1.ActivateExternalRewardsVaultResponse\x12\x87\x01\n\x13\x45xternalRewardsLend\x12\x33.comdex.rewards.v1beta1.ActivateExternalRewardsLend\x1a;.comdex.rewards.v1beta1.ActivateExternalRewardsLendResponse\x12\x99\x01\n\x19\x45xternalRewardsStableMint\x12\x39.comdex.rewards.v1beta1.ActivateExternalRewardsStableMint\x1a\x41.comdex.rewards.v1beta1.ActivateExternalRewardsStableMintResponseB\xd2\x01\n\x1a\x63om.comdex.rewards.v1beta1B\x07TxProtoP\x01Z1github.com/comdex-official/comdex/x/rewards/types\xa2\x02\x03\x43RX\xaa\x02\x16\x43omdex.Rewards.V1beta1\xca\x02\x16\x43omdex\\Rewards\\V1beta1\xe2\x02\"Comdex\\Rewards\\V1beta1\\GPBMetadata\xea\x02\x18\x43omdex::Rewards::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.rewards.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.comdex.rewards.v1beta1B\007TxProtoP\001Z1github.com/comdex-official/comdex/x/rewards/types\242\002\003CRX\252\002\026Comdex.Rewards.V1beta1\312\002\026Comdex\\Rewards\\V1beta1\342\002\"Comdex\\Rewards\\V1beta1\\GPBMetadata\352\002\030Comdex::Rewards::V1beta1'
  _MSGCREATEGAUGE.fields_by_name['from']._options = None
  _MSGCREATEGAUGE.fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _MSGCREATEGAUGE.fields_by_name['trigger_duration']._options = None
  _MSGCREATEGAUGE.fields_by_name['trigger_duration']._serialized_options = b'\310\336\037\000\352\336\037\032trigger_duration,omitempty\362\336\037\027yaml:\"trigger_duration\"\230\337\037\001'
  _MSGCREATEGAUGE.fields_by_name['deposit_amount']._options = None
  _MSGCREATEGAUGE.fields_by_name['deposit_amount']._serialized_options = b'\310\336\037\000\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGCREATEGAUGE.fields_by_name['start_time']._options = None
  _MSGCREATEGAUGE.fields_by_name['start_time']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"start_time\"\220\337\037\001'
  _WHITELISTASSET.fields_by_name['app_mapping_id']._options = None
  _WHITELISTASSET.fields_by_name['app_mapping_id']._serialized_options = b'\362\336\037\025yaml:\"app_mapping_id\"'
  _WHITELISTASSET.fields_by_name['from']._options = None
  _WHITELISTASSET.fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _WHITELISTASSET.fields_by_name['asset_id']._options = None
  _WHITELISTASSET.fields_by_name['asset_id']._serialized_options = b'\362\336\037\017yaml:\"asset_id\"'
  _REMOVEWHITELISTASSET.fields_by_name['app_mapping_id']._options = None
  _REMOVEWHITELISTASSET.fields_by_name['app_mapping_id']._serialized_options = b'\362\336\037\025yaml:\"app_mapping_id\"'
  _REMOVEWHITELISTASSET.fields_by_name['from']._options = None
  _REMOVEWHITELISTASSET.fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _REMOVEWHITELISTASSET.fields_by_name['asset_id']._options = None
  _REMOVEWHITELISTASSET.fields_by_name['asset_id']._serialized_options = b'\362\336\037\017yaml:\"asset_id\"'
  _WHITELISTAPPIDVAULT.fields_by_name['app_mapping_id']._options = None
  _WHITELISTAPPIDVAULT.fields_by_name['app_mapping_id']._serialized_options = b'\362\336\037\033yaml:\"app_mapping_id_vault\"'
  _WHITELISTAPPIDVAULT.fields_by_name['from']._options = None
  _WHITELISTAPPIDVAULT.fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _REMOVEWHITELISTAPPIDVAULT.fields_by_name['app_mapping_id']._options = None
  _REMOVEWHITELISTAPPIDVAULT.fields_by_name['app_mapping_id']._serialized_options = b'\362\336\037\033yaml:\"app_mapping_id_vault\"'
  _REMOVEWHITELISTAPPIDVAULT.fields_by_name['from']._options = None
  _REMOVEWHITELISTAPPIDVAULT.fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _ACTIVATEEXTERNALREWARDSLOCKERS.fields_by_name['app_mapping_id']._options = None
  _ACTIVATEEXTERNALREWARDSLOCKERS.fields_by_name['app_mapping_id']._serialized_options = b'\362\336\037\025yaml:\"app_mapping_id\"'
  _ACTIVATEEXTERNALREWARDSLOCKERS.fields_by_name['asset_id']._options = None
  _ACTIVATEEXTERNALREWARDSLOCKERS.fields_by_name['asset_id']._serialized_options = b'\362\336\037\017yaml:\"asset_id\"'
  _ACTIVATEEXTERNALREWARDSLOCKERS.fields_by_name['total_rewards']._options = None
  _ACTIVATEEXTERNALREWARDSLOCKERS.fields_by_name['total_rewards']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"total_rewards\"\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _ACTIVATEEXTERNALREWARDSLOCKERS.fields_by_name['duration_days']._options = None
  _ACTIVATEEXTERNALREWARDSLOCKERS.fields_by_name['duration_days']._serialized_options = b'\362\336\037\024yaml:\"duration_days\"'
  _ACTIVATEEXTERNALREWARDSLOCKERS.fields_by_name['depositor']._options = None
  _ACTIVATEEXTERNALREWARDSLOCKERS.fields_by_name['depositor']._serialized_options = b'\362\336\037\020yaml:\"depositor\"'
  _ACTIVATEEXTERNALREWARDSLOCKERS.fields_by_name['min_lockup_time_seconds']._options = None
  _ACTIVATEEXTERNALREWARDSLOCKERS.fields_by_name['min_lockup_time_seconds']._serialized_options = b'\362\336\037\036yaml:\"min_lockup_time_seconds\"'
  _ACTIVATEEXTERNALREWARDSVAULT.fields_by_name['app_mapping_id']._options = None
  _ACTIVATEEXTERNALREWARDSVAULT.fields_by_name['app_mapping_id']._serialized_options = b'\362\336\037\025yaml:\"app_mapping_id\"'
  _ACTIVATEEXTERNALREWARDSVAULT.fields_by_name['extended_pair_id']._options = None
  _ACTIVATEEXTERNALREWARDSVAULT.fields_by_name['extended_pair_id']._serialized_options = b'\362\336\037\027yaml:\"extended_Pair_id\"'
  _ACTIVATEEXTERNALREWARDSVAULT.fields_by_name['total_rewards']._options = None
  _ACTIVATEEXTERNALREWARDSVAULT.fields_by_name['total_rewards']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"total_rewards\"\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _ACTIVATEEXTERNALREWARDSVAULT.fields_by_name['duration_days']._options = None
  _ACTIVATEEXTERNALREWARDSVAULT.fields_by_name['duration_days']._serialized_options = b'\362\336\037\024yaml:\"duration_days\"'
  _ACTIVATEEXTERNALREWARDSVAULT.fields_by_name['depositor']._options = None
  _ACTIVATEEXTERNALREWARDSVAULT.fields_by_name['depositor']._serialized_options = b'\362\336\037\020yaml:\"depositor\"'
  _ACTIVATEEXTERNALREWARDSVAULT.fields_by_name['min_lockup_time_seconds']._options = None
  _ACTIVATEEXTERNALREWARDSVAULT.fields_by_name['min_lockup_time_seconds']._serialized_options = b'\362\336\037\036yaml:\"min_lockup_time_seconds\"'
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['app_mapping_id']._options = None
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['app_mapping_id']._serialized_options = b'\362\336\037\025yaml:\"app_mapping_id\"'
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['c_pool_id']._options = None
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['c_pool_id']._serialized_options = b'\362\336\037\020yaml:\"c_pool_id\"'
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['asset_id']._options = None
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['asset_id']._serialized_options = b'\362\336\037\017yaml:\"asset_id\"'
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['c_swap_app_id']._options = None
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['c_swap_app_id']._serialized_options = b'\362\336\037\024yaml:\"c_swap_app_id\"'
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['c_swap_min_lock_amount']._options = None
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['c_swap_min_lock_amount']._serialized_options = b'\362\336\037\024yaml:\"c_swap_app_id\"'
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['total_rewards']._options = None
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['total_rewards']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"total_rewards\"\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['master_pool_id']._options = None
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['master_pool_id']._serialized_options = b'\362\336\037\025yaml:\"master_pool_id\"'
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['duration_days']._options = None
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['duration_days']._serialized_options = b'\362\336\037\024yaml:\"duration_days\"'
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['min_lockup_time_seconds']._options = None
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['min_lockup_time_seconds']._serialized_options = b'\362\336\037\036yaml:\"min_lockup_time_seconds\"'
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['depositor']._options = None
  _ACTIVATEEXTERNALREWARDSLEND.fields_by_name['depositor']._serialized_options = b'\362\336\037\020yaml:\"depositor\"'
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['app_id']._options = None
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['cswap_app_id']._options = None
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['cswap_app_id']._serialized_options = b'\362\336\037\023yaml:\"cswap_app_id\"'
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['commodo_app_id']._options = None
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['commodo_app_id']._serialized_options = b'\362\336\037\025yaml:\"commodo_app_id\"'
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['total_rewards']._options = None
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['total_rewards']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"total_rewards\"\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['duration_days']._options = None
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['duration_days']._serialized_options = b'\362\336\037\024yaml:\"duration_days\"'
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['depositor']._options = None
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['depositor']._serialized_options = b'\362\336\037\020yaml:\"depositor\"'
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['accepted_block_height']._options = None
  _ACTIVATEEXTERNALREWARDSSTABLEMINT.fields_by_name['accepted_block_height']._serialized_options = b'\362\336\037\034yaml:\"accepted_block_height\"'
  _globals['_MSGCREATEGAUGE']._serialized_start=215
  _globals['_MSGCREATEGAUGE']._serialized_end=814
  _globals['_MSGCREATEGAUGERESPONSE']._serialized_start=816
  _globals['_MSGCREATEGAUGERESPONSE']._serialized_end=840
  _globals['_WHITELISTASSET']._serialized_start=843
  _globals['_WHITELISTASSET']._serialized_end=1009
  _globals['_REMOVEWHITELISTASSET']._serialized_start=1012
  _globals['_REMOVEWHITELISTASSET']._serialized_end=1184
  _globals['_MSGWHITELISTASSETRESPONSE']._serialized_start=1186
  _globals['_MSGWHITELISTASSETRESPONSE']._serialized_end=1213
  _globals['_MSGREMOVEWHITELISTASSETRESPONSE']._serialized_start=1215
  _globals['_MSGREMOVEWHITELISTASSETRESPONSE']._serialized_end=1248
  _globals['_WHITELISTAPPIDVAULT']._serialized_start=1251
  _globals['_WHITELISTAPPIDVAULT']._serialized_end=1380
  _globals['_REMOVEWHITELISTAPPIDVAULT']._serialized_start=1383
  _globals['_REMOVEWHITELISTAPPIDVAULT']._serialized_end=1518
  _globals['_MSGWHITELISTAPPIDVAULTRESPONSE']._serialized_start=1520
  _globals['_MSGWHITELISTAPPIDVAULTRESPONSE']._serialized_end=1552
  _globals['_MSGREMOVEWHITELISTAPPIDVAULTRESPONSE']._serialized_start=1554
  _globals['_MSGREMOVEWHITELISTAPPIDVAULTRESPONSE']._serialized_end=1592
  _globals['_ACTIVATEEXTERNALREWARDSLOCKERS']._serialized_start=1595
  _globals['_ACTIVATEEXTERNALREWARDSLOCKERS']._serialized_end=2084
  _globals['_ACTIVATEEXTERNALREWARDSLOCKERSRESPONSE']._serialized_start=2086
  _globals['_ACTIVATEEXTERNALREWARDSLOCKERSRESPONSE']._serialized_end=2126
  _globals['_ACTIVATEEXTERNALREWARDSVAULT']._serialized_start=2129
  _globals['_ACTIVATEEXTERNALREWARDSVAULT']._serialized_end=2639
  _globals['_ACTIVATEEXTERNALREWARDSVAULTRESPONSE']._serialized_start=2641
  _globals['_ACTIVATEEXTERNALREWARDSVAULTRESPONSE']._serialized_end=2679
  _globals['_ACTIVATEEXTERNALREWARDSLEND']._serialized_start=2682
  _globals['_ACTIVATEEXTERNALREWARDSLEND']._serialized_end=3422
  _globals['_ACTIVATEEXTERNALREWARDSLENDRESPONSE']._serialized_start=3424
  _globals['_ACTIVATEEXTERNALREWARDSLENDRESPONSE']._serialized_end=3461
  _globals['_ACTIVATEEXTERNALREWARDSSTABLEMINT']._serialized_start=3464
  _globals['_ACTIVATEEXTERNALREWARDSSTABLEMINT']._serialized_end=4004
  _globals['_ACTIVATEEXTERNALREWARDSSTABLEMINTRESPONSE']._serialized_start=4006
  _globals['_ACTIVATEEXTERNALREWARDSSTABLEMINTRESPONSE']._serialized_end=4049
  _globals['_MSG']._serialized_start=4052
  _globals['_MSG']._serialized_end=4742
# @@protoc_insertion_point(module_scope)