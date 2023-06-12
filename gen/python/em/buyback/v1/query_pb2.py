# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: em/buyback/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19\x65m/buyback/v1/query.proto\x12\rem.buyback.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x15\n\x13QueryBalanceRequest\"\x8f\x01\n\x14QueryBalanceResponse\x12w\n\x07\x62\x61lance\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBB\xc8\xde\x1f\x00\xf2\xde\x1f\x0eyaml:\"balance\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x07\x62\x61lance\"\x19\n\x17QueryBuybackTimeRequest\"\xe0\x01\n\x18QueryBuybackTimeResponse\x12\x61\n\x08last_run\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB*\xc8\xde\x1f\x00\xe2\xde\x1f\x0bLastRunTime\xf2\xde\x1f\x0fyaml:\"last_run\"\x90\xdf\x1f\x01R\x07lastRun\x12\x61\n\x08next_run\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB*\xc8\xde\x1f\x00\xe2\xde\x1f\x0bNextRunTime\xf2\xde\x1f\x0fyaml:\"next_run\"\x90\xdf\x1f\x01R\x07nextRun2\x83\x02\n\x05Query\x12w\n\x07\x42\x61lance\x12\".em.buyback.v1.QueryBalanceRequest\x1a#.em.buyback.v1.QueryBalanceResponse\"#\x82\xd3\xe4\x93\x02\x1d\x12\x1b/e-money/buyback/v1/balance\x12\x80\x01\n\x0b\x42uybackTime\x12&.em.buyback.v1.QueryBuybackTimeRequest\x1a\'.em.buyback.v1.QueryBuybackTimeResponse\" \x82\xd3\xe4\x93\x02\x1a\x12\x18/e-money/buyback/v1/timeB\xac\x01\n\x11\x63om.em.buyback.v1B\nQueryProtoP\x01Z5github.com/e-money/em-ledger/x/buyback/internal/types\xa2\x02\x03\x45\x42X\xaa\x02\rEm.Buyback.V1\xca\x02\rEm\\Buyback\\V1\xe2\x02\x19\x45m\\Buyback\\V1\\GPBMetadata\xea\x02\x0f\x45m::Buyback::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'em.buyback.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\021com.em.buyback.v1B\nQueryProtoP\001Z5github.com/e-money/em-ledger/x/buyback/internal/types\242\002\003EBX\252\002\rEm.Buyback.V1\312\002\rEm\\Buyback\\V1\342\002\031Em\\Buyback\\V1\\GPBMetadata\352\002\017Em::Buyback::V1'
  _QUERYBALANCERESPONSE.fields_by_name['balance']._options = None
  _QUERYBALANCERESPONSE.fields_by_name['balance']._serialized_options = b'\310\336\037\000\362\336\037\016yaml:\"balance\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _QUERYBUYBACKTIMERESPONSE.fields_by_name['last_run']._options = None
  _QUERYBUYBACKTIMERESPONSE.fields_by_name['last_run']._serialized_options = b'\310\336\037\000\342\336\037\013LastRunTime\362\336\037\017yaml:\"last_run\"\220\337\037\001'
  _QUERYBUYBACKTIMERESPONSE.fields_by_name['next_run']._options = None
  _QUERYBUYBACKTIMERESPONSE.fields_by_name['next_run']._serialized_options = b'\310\336\037\000\342\336\037\013NextRunTime\362\336\037\017yaml:\"next_run\"\220\337\037\001'
  _QUERY.methods_by_name['Balance']._options = None
  _QUERY.methods_by_name['Balance']._serialized_options = b'\202\323\344\223\002\035\022\033/e-money/buyback/v1/balance'
  _QUERY.methods_by_name['BuybackTime']._options = None
  _QUERY.methods_by_name['BuybackTime']._serialized_options = b'\202\323\344\223\002\032\022\030/e-money/buyback/v1/time'
  _globals['_QUERYBALANCEREQUEST']._serialized_start=161
  _globals['_QUERYBALANCEREQUEST']._serialized_end=182
  _globals['_QUERYBALANCERESPONSE']._serialized_start=185
  _globals['_QUERYBALANCERESPONSE']._serialized_end=328
  _globals['_QUERYBUYBACKTIMEREQUEST']._serialized_start=330
  _globals['_QUERYBUYBACKTIMEREQUEST']._serialized_end=355
  _globals['_QUERYBUYBACKTIMERESPONSE']._serialized_start=358
  _globals['_QUERYBUYBACKTIMERESPONSE']._serialized_end=582
  _globals['_QUERY']._serialized_start=585
  _globals['_QUERY']._serialized_end=844
# @@protoc_insertion_point(module_scope)
