# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sommelier/cellarfees/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from sommelier.cellarfees.v1 import params_pb2 as sommelier_dot_cellarfees_dot_v1_dot_params__pb2
from sommelier.cellarfees.v1 import cellarfees_pb2 as sommelier_dot_cellarfees_dot_v1_dot_cellarfees__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#sommelier/cellarfees/v1/query.proto\x12\rcellarfees.v1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a$sommelier/cellarfees/v1/params.proto\x1a(sommelier/cellarfees/v1/cellarfees.proto\"\x14\n\x12QueryParamsRequest\"J\n\x13QueryParamsResponse\x12\x33\n\x06params\x18\x01 \x01(\x0b\x32\x15.cellarfees.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"\x1c\n\x1aQueryModuleAccountsRequest\"@\n\x1bQueryModuleAccountsResponse\x12!\n\x0c\x66\x65\x65s_address\x18\x01 \x01(\tR\x0b\x66\x65\x65sAddress\"\"\n QueryLastRewardSupplyPeakRequest\"\x8a\x01\n!QueryLastRewardSupplyPeakResponse\x12\x65\n\x17last_reward_supply_peak\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x14lastRewardSupplyPeak\" \n\x1eQueryFeeAccrualCountersRequest\"|\n\x1fQueryFeeAccrualCountersResponse\x12Y\n\x14\x66\x65\x65_accrual_counters\x18\x01 \x01(\x0b\x32!.cellarfees.v1.FeeAccrualCountersB\x04\xc8\xde\x1f\x00R\x12\x66\x65\x65\x41\x63\x63rualCounters\"\x11\n\x0fQueryAPYRequest\"$\n\x10QueryAPYResponse\x12\x10\n\x03\x61py\x18\x01 \x01(\tR\x03\x61py2\x87\x06\n\x05Query\x12}\n\x0bQueryParams\x12!.cellarfees.v1.QueryParamsRequest\x1a\".cellarfees.v1.QueryParamsResponse\"\'\x82\xd3\xe4\x93\x02!\x12\x1f/sommelier/cellarfees/v1/params\x12\x9e\x01\n\x13QueryModuleAccounts\x12).cellarfees.v1.QueryModuleAccountsRequest\x1a*.cellarfees.v1.QueryModuleAccountsResponse\"0\x82\xd3\xe4\x93\x02*\x12(/sommelier/cellarfees/v1/module_accounts\x12\xb8\x01\n\x19QueryLastRewardSupplyPeak\x12/.cellarfees.v1.QueryLastRewardSupplyPeakRequest\x1a\x30.cellarfees.v1.QueryLastRewardSupplyPeakResponse\"8\x82\xd3\xe4\x93\x02\x32\x12\x30/sommelier/cellarfees/v1/last_reward_supply_peak\x12\xaf\x01\n\x17QueryFeeAccrualCounters\x12-.cellarfees.v1.QueryFeeAccrualCountersRequest\x1a..cellarfees.v1.QueryFeeAccrualCountersResponse\"5\x82\xd3\xe4\x93\x02/\x12-/sommelier/cellarfees/v1/fee_accrual_counters\x12q\n\x08QueryAPY\x12\x1e.cellarfees.v1.QueryAPYRequest\x1a\x1f.cellarfees.v1.QueryAPYResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/sommelier/cellarfees/v1/apyB\xa8\x01\n\x11\x63om.cellarfees.v1B\nQueryProtoP\x01Z2github.com/peggyjv/sommelier/v4/x/cellarfees/types\xa2\x02\x03\x43XX\xaa\x02\rCellarfees.V1\xca\x02\rCellarfees\\V1\xe2\x02\x19\x43\x65llarfees\\V1\\GPBMetadata\xea\x02\x0e\x43\x65llarfees::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sommelier.cellarfees.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\021com.cellarfees.v1B\nQueryProtoP\001Z2github.com/peggyjv/sommelier/v4/x/cellarfees/types\242\002\003CXX\252\002\rCellarfees.V1\312\002\rCellarfees\\V1\342\002\031Cellarfees\\V1\\GPBMetadata\352\002\016Cellarfees::V1'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERYLASTREWARDSUPPLYPEAKRESPONSE.fields_by_name['last_reward_supply_peak']._options = None
  _QUERYLASTREWARDSUPPLYPEAKRESPONSE.fields_by_name['last_reward_supply_peak']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _QUERYFEEACCRUALCOUNTERSRESPONSE.fields_by_name['fee_accrual_counters']._options = None
  _QUERYFEEACCRUALCOUNTERSRESPONSE.fields_by_name['fee_accrual_counters']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['QueryParams']._options = None
  _QUERY.methods_by_name['QueryParams']._serialized_options = b'\202\323\344\223\002!\022\037/sommelier/cellarfees/v1/params'
  _QUERY.methods_by_name['QueryModuleAccounts']._options = None
  _QUERY.methods_by_name['QueryModuleAccounts']._serialized_options = b'\202\323\344\223\002*\022(/sommelier/cellarfees/v1/module_accounts'
  _QUERY.methods_by_name['QueryLastRewardSupplyPeak']._options = None
  _QUERY.methods_by_name['QueryLastRewardSupplyPeak']._serialized_options = b'\202\323\344\223\0022\0220/sommelier/cellarfees/v1/last_reward_supply_peak'
  _QUERY.methods_by_name['QueryFeeAccrualCounters']._options = None
  _QUERY.methods_by_name['QueryFeeAccrualCounters']._serialized_options = b'\202\323\344\223\002/\022-/sommelier/cellarfees/v1/fee_accrual_counters'
  _QUERY.methods_by_name['QueryAPY']._options = None
  _QUERY.methods_by_name['QueryAPY']._serialized_options = b'\202\323\344\223\002\036\022\034/sommelier/cellarfees/v1/apy'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=186
  _globals['_QUERYPARAMSREQUEST']._serialized_end=206
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=208
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=282
  _globals['_QUERYMODULEACCOUNTSREQUEST']._serialized_start=284
  _globals['_QUERYMODULEACCOUNTSREQUEST']._serialized_end=312
  _globals['_QUERYMODULEACCOUNTSRESPONSE']._serialized_start=314
  _globals['_QUERYMODULEACCOUNTSRESPONSE']._serialized_end=378
  _globals['_QUERYLASTREWARDSUPPLYPEAKREQUEST']._serialized_start=380
  _globals['_QUERYLASTREWARDSUPPLYPEAKREQUEST']._serialized_end=414
  _globals['_QUERYLASTREWARDSUPPLYPEAKRESPONSE']._serialized_start=417
  _globals['_QUERYLASTREWARDSUPPLYPEAKRESPONSE']._serialized_end=555
  _globals['_QUERYFEEACCRUALCOUNTERSREQUEST']._serialized_start=557
  _globals['_QUERYFEEACCRUALCOUNTERSREQUEST']._serialized_end=589
  _globals['_QUERYFEEACCRUALCOUNTERSRESPONSE']._serialized_start=591
  _globals['_QUERYFEEACCRUALCOUNTERSRESPONSE']._serialized_end=715
  _globals['_QUERYAPYREQUEST']._serialized_start=717
  _globals['_QUERYAPYREQUEST']._serialized_end=734
  _globals['_QUERYAPYRESPONSE']._serialized_start=736
  _globals['_QUERYAPYRESPONSE']._serialized_end=772
  _globals['_QUERY']._serialized_start=775
  _globals['_QUERY']._serialized_end=1550
# @@protoc_insertion_point(module_scope)
