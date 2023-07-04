# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/profiles/v3/models_params.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&desmos/profiles/v3/models_params.proto\x12\x12\x64\x65smos.profiles.v3\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1egoogle/protobuf/duration.proto\"\xa9\x03\n\x06Params\x12W\n\x08nickname\x18\x01 \x01(\x0b\x32\".desmos.profiles.v3.NicknameParamsB\x17\xc8\xde\x1f\x00\xf2\xde\x1f\x0fyaml:\"nickname\"R\x08nickname\x12O\n\x04\x64tag\x18\x02 \x01(\x0b\x32\x1e.desmos.profiles.v3.DTagParamsB\x1b\xc8\xde\x1f\x00\xe2\xde\x1f\x04\x44Tag\xf2\xde\x1f\x0byaml:\"dtag\"R\x04\x64tag\x12\x43\n\x03\x62io\x18\x03 \x01(\x0b\x32\x1d.desmos.profiles.v3.BioParamsB\x12\xc8\xde\x1f\x00\xf2\xde\x1f\nyaml:\"bio\"R\x03\x62io\x12O\n\x06oracle\x18\x04 \x01(\x0b\x32 .desmos.profiles.v3.OracleParamsB\x15\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"oracle\"R\x06oracle\x12Y\n\tapp_links\x18\x05 \x01(\x0b\x32\".desmos.profiles.v3.AppLinksParamsB\x18\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"app_links\"R\x08\x61ppLinks:\x04\x88\xa0\x1f\x00\"\xde\x01\n\x0eNicknameParams\x12\x62\n\nmin_length\x18\x01 \x01(\x0c\x42\x43\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x11yaml:\"min_length\"R\tminLength\x12\x62\n\nmax_length\x18\x02 \x01(\x0c\x42\x43\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x11yaml:\"max_length\"R\tmaxLength:\x04\x88\xa0\x1f\x00\"\x9e\x02\n\nDTagParams\x12(\n\x06reg_ex\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"reg_ex\"R\x05regEx\x12o\n\nmin_length\x18\x02 \x01(\x0c\x42P\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xe2\xde\x1f\tMinLength\xf2\xde\x1f\x11yaml:\"min_length\"R\tminLength\x12o\n\nmax_length\x18\x03 \x01(\x0c\x42P\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xe2\xde\x1f\tMaxLength\xf2\xde\x1f\x11yaml:\"max_length\"R\tmaxLength:\x04\x88\xa0\x1f\x00\"u\n\tBioParams\x12\x62\n\nmax_length\x18\x03 \x01(\x0c\x42\x43\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x11yaml:\"max_length\"R\tmaxLength:\x04\x88\xa0\x1f\x00\"\xac\x03\n\x0cOracleParams\x12=\n\tscript_id\x18\x01 \x01(\x04\x42 \xe2\xde\x1f\x08ScriptID\xf2\xde\x1f\x10yaml:\"script_id\"R\x08scriptId\x12\x31\n\task_count\x18\x02 \x01(\x04\x42\x14\xf2\xde\x1f\x10yaml:\"ask_count\"R\x08\x61skCount\x12\x31\n\tmin_count\x18\x03 \x01(\x04\x42\x14\xf2\xde\x1f\x10yaml:\"min_count\"R\x08minCount\x12\x37\n\x0bprepare_gas\x18\x04 \x01(\x04\x42\x16\xf2\xde\x1f\x12yaml:\"prepare_gas\"R\nprepareGas\x12\x37\n\x0b\x65xecute_gas\x18\x05 \x01(\x04\x42\x16\xf2\xde\x1f\x12yaml:\"execute_gas\"R\nexecuteGas\x12\x7f\n\nfee_amount\x18\x06 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBE\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"fee_amount\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\tfeeAmount:\x04\x88\xa0\x1f\x00\"\x84\x01\n\x0e\x41ppLinksParams\x12l\n\x11validity_duration\x18\x01 \x01(\x0b\x32\x19.google.protobuf.DurationB$\xc8\xde\x1f\x00\xf2\xde\x1f\x18yaml:\"validity_duration\"\x98\xdf\x1f\x01R\x10validityDuration:\x04\x88\xa0\x1f\x00\x42\xc8\x01\n\x16\x63om.desmos.profiles.v3B\x11ModelsParamsProtoP\x01Z1github.com/desmos-labs/desmos/v5/x/profiles/types\xa2\x02\x03\x44PX\xaa\x02\x12\x44\x65smos.Profiles.V3\xca\x02\x12\x44\x65smos\\Profiles\\V3\xe2\x02\x1e\x44\x65smos\\Profiles\\V3\\GPBMetadata\xea\x02\x14\x44\x65smos::Profiles::V3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.profiles.v3.models_params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.desmos.profiles.v3B\021ModelsParamsProtoP\001Z1github.com/desmos-labs/desmos/v5/x/profiles/types\242\002\003DPX\252\002\022Desmos.Profiles.V3\312\002\022Desmos\\Profiles\\V3\342\002\036Desmos\\Profiles\\V3\\GPBMetadata\352\002\024Desmos::Profiles::V3'
  _PARAMS.fields_by_name['nickname']._options = None
  _PARAMS.fields_by_name['nickname']._serialized_options = b'\310\336\037\000\362\336\037\017yaml:\"nickname\"'
  _PARAMS.fields_by_name['dtag']._options = None
  _PARAMS.fields_by_name['dtag']._serialized_options = b'\310\336\037\000\342\336\037\004DTag\362\336\037\013yaml:\"dtag\"'
  _PARAMS.fields_by_name['bio']._options = None
  _PARAMS.fields_by_name['bio']._serialized_options = b'\310\336\037\000\362\336\037\nyaml:\"bio\"'
  _PARAMS.fields_by_name['oracle']._options = None
  _PARAMS.fields_by_name['oracle']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"oracle\"'
  _PARAMS.fields_by_name['app_links']._options = None
  _PARAMS.fields_by_name['app_links']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"app_links\"'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\210\240\037\000'
  _NICKNAMEPARAMS.fields_by_name['min_length']._options = None
  _NICKNAMEPARAMS.fields_by_name['min_length']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\021yaml:\"min_length\"'
  _NICKNAMEPARAMS.fields_by_name['max_length']._options = None
  _NICKNAMEPARAMS.fields_by_name['max_length']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\021yaml:\"max_length\"'
  _NICKNAMEPARAMS._options = None
  _NICKNAMEPARAMS._serialized_options = b'\210\240\037\000'
  _DTAGPARAMS.fields_by_name['reg_ex']._options = None
  _DTAGPARAMS.fields_by_name['reg_ex']._serialized_options = b'\362\336\037\ryaml:\"reg_ex\"'
  _DTAGPARAMS.fields_by_name['min_length']._options = None
  _DTAGPARAMS.fields_by_name['min_length']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\342\336\037\tMinLength\362\336\037\021yaml:\"min_length\"'
  _DTAGPARAMS.fields_by_name['max_length']._options = None
  _DTAGPARAMS.fields_by_name['max_length']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\342\336\037\tMaxLength\362\336\037\021yaml:\"max_length\"'
  _DTAGPARAMS._options = None
  _DTAGPARAMS._serialized_options = b'\210\240\037\000'
  _BIOPARAMS.fields_by_name['max_length']._options = None
  _BIOPARAMS.fields_by_name['max_length']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\021yaml:\"max_length\"'
  _BIOPARAMS._options = None
  _BIOPARAMS._serialized_options = b'\210\240\037\000'
  _ORACLEPARAMS.fields_by_name['script_id']._options = None
  _ORACLEPARAMS.fields_by_name['script_id']._serialized_options = b'\342\336\037\010ScriptID\362\336\037\020yaml:\"script_id\"'
  _ORACLEPARAMS.fields_by_name['ask_count']._options = None
  _ORACLEPARAMS.fields_by_name['ask_count']._serialized_options = b'\362\336\037\020yaml:\"ask_count\"'
  _ORACLEPARAMS.fields_by_name['min_count']._options = None
  _ORACLEPARAMS.fields_by_name['min_count']._serialized_options = b'\362\336\037\020yaml:\"min_count\"'
  _ORACLEPARAMS.fields_by_name['prepare_gas']._options = None
  _ORACLEPARAMS.fields_by_name['prepare_gas']._serialized_options = b'\362\336\037\022yaml:\"prepare_gas\"'
  _ORACLEPARAMS.fields_by_name['execute_gas']._options = None
  _ORACLEPARAMS.fields_by_name['execute_gas']._serialized_options = b'\362\336\037\022yaml:\"execute_gas\"'
  _ORACLEPARAMS.fields_by_name['fee_amount']._options = None
  _ORACLEPARAMS.fields_by_name['fee_amount']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"fee_amount\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _ORACLEPARAMS._options = None
  _ORACLEPARAMS._serialized_options = b'\210\240\037\000'
  _APPLINKSPARAMS.fields_by_name['validity_duration']._options = None
  _APPLINKSPARAMS.fields_by_name['validity_duration']._serialized_options = b'\310\336\037\000\362\336\037\030yaml:\"validity_duration\"\230\337\037\001'
  _APPLINKSPARAMS._options = None
  _APPLINKSPARAMS._serialized_options = b'\210\240\037\000'
  _globals['_PARAMS']._serialized_start=149
  _globals['_PARAMS']._serialized_end=574
  _globals['_NICKNAMEPARAMS']._serialized_start=577
  _globals['_NICKNAMEPARAMS']._serialized_end=799
  _globals['_DTAGPARAMS']._serialized_start=802
  _globals['_DTAGPARAMS']._serialized_end=1088
  _globals['_BIOPARAMS']._serialized_start=1090
  _globals['_BIOPARAMS']._serialized_end=1207
  _globals['_ORACLEPARAMS']._serialized_start=1210
  _globals['_ORACLEPARAMS']._serialized_end=1638
  _globals['_APPLINKSPARAMS']._serialized_start=1641
  _globals['_APPLINKSPARAMS']._serialized_end=1773
# @@protoc_insertion_point(module_scope)