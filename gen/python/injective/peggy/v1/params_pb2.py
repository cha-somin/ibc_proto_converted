# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: injective/peggy/v1/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1finjective/peggy/v1/params.proto\x12\x12injective.peggy.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xf8\n\n\x06Params\x12\x19\n\x08peggy_id\x18\x01 \x01(\tR\x07peggyId\x12\x30\n\x14\x63ontract_source_hash\x18\x02 \x01(\tR\x12\x63ontractSourceHash\x12\x36\n\x17\x62ridge_ethereum_address\x18\x03 \x01(\tR\x15\x62ridgeEthereumAddress\x12&\n\x0f\x62ridge_chain_id\x18\x04 \x01(\x04R\rbridgeChainId\x12\x32\n\x15signed_valsets_window\x18\x05 \x01(\x04R\x13signedValsetsWindow\x12\x32\n\x15signed_batches_window\x18\x06 \x01(\x04R\x13signedBatchesWindow\x12\x30\n\x14signed_claims_window\x18\x07 \x01(\x04R\x12signedClaimsWindow\x12\x30\n\x14target_batch_timeout\x18\x08 \x01(\x04R\x12targetBatchTimeout\x12,\n\x12\x61verage_block_time\x18\t \x01(\x04R\x10\x61verageBlockTime\x12=\n\x1b\x61verage_ethereum_block_time\x18\n \x01(\x04R\x18\x61verageEthereumBlockTime\x12\x62\n\x15slash_fraction_valset\x18\x0b \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x13slashFractionValset\x12`\n\x14slash_fraction_batch\x18\x0c \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x12slashFractionBatch\x12`\n\x14slash_fraction_claim\x18\r \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x12slashFractionClaim\x12w\n slash_fraction_conflicting_claim\x18\x0e \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x1dslashFractionConflictingClaim\x12\x43\n\x1eunbond_slashing_valsets_window\x18\x0f \x01(\x04R\x1bunbondSlashingValsetsWindow\x12v\n slash_fraction_bad_eth_signature\x18\x10 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x1cslashFractionBadEthSignature\x12*\n\x11\x63osmos_coin_denom\x18\x11 \x01(\tR\x0f\x63osmosCoinDenom\x12;\n\x1a\x63osmos_coin_erc20_contract\x18\x12 \x01(\tR\x17\x63osmosCoinErc20Contract\x12\x34\n\x16\x63laim_slashing_enabled\x18\x13 \x01(\x08R\x14\x63laimSlashingEnabled\x12?\n\x1c\x62ridge_contract_start_height\x18\x14 \x01(\x04R\x19\x62ridgeContractStartHeight\x12\x44\n\rvalset_reward\x18\x15 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x0cvalsetReward:\x04\x80\xdc \x00\x42\xdc\x01\n\x16\x63om.injective.peggy.v1B\x0bParamsProtoP\x01ZKgithub.com/InjectiveLabs/injective-core/injective-chain/modules/peggy/types\xa2\x02\x03IPX\xaa\x02\x12Injective.Peggy.V1\xca\x02\x12Injective\\Peggy\\V1\xe2\x02\x1eInjective\\Peggy\\V1\\GPBMetadata\xea\x02\x14Injective::Peggy::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'injective.peggy.v1.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.injective.peggy.v1B\013ParamsProtoP\001ZKgithub.com/InjectiveLabs/injective-core/injective-chain/modules/peggy/types\242\002\003IPX\252\002\022Injective.Peggy.V1\312\002\022Injective\\Peggy\\V1\342\002\036Injective\\Peggy\\V1\\GPBMetadata\352\002\024Injective::Peggy::V1'
  _PARAMS.fields_by_name['slash_fraction_valset']._options = None
  _PARAMS.fields_by_name['slash_fraction_valset']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS.fields_by_name['slash_fraction_batch']._options = None
  _PARAMS.fields_by_name['slash_fraction_batch']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS.fields_by_name['slash_fraction_claim']._options = None
  _PARAMS.fields_by_name['slash_fraction_claim']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS.fields_by_name['slash_fraction_conflicting_claim']._options = None
  _PARAMS.fields_by_name['slash_fraction_conflicting_claim']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS.fields_by_name['slash_fraction_bad_eth_signature']._options = None
  _PARAMS.fields_by_name['slash_fraction_bad_eth_signature']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS.fields_by_name['valset_reward']._options = None
  _PARAMS.fields_by_name['valset_reward']._serialized_options = b'\310\336\037\000'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\200\334 \000'
  _globals['_PARAMS']._serialized_start=110
  _globals['_PARAMS']._serialized_end=1510
# @@protoc_insertion_point(module_scope)
