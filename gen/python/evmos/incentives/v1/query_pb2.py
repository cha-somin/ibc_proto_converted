# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: evmos/incentives/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from evmos.incentives.v1 import genesis_pb2 as evmos_dot_incentives_dot_v1_dot_genesis__pb2
from evmos.incentives.v1 import incentives_pb2 as evmos_dot_incentives_dot_v1_dot_incentives__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1f\x65vmos/incentives/v1/query.proto\x12\x13\x65vmos.incentives.v1\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a!evmos/incentives/v1/genesis.proto\x1a$evmos/incentives/v1/incentives.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\"`\n\x16QueryIncentivesRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xa8\x01\n\x17QueryIncentivesResponse\x12\x44\n\nincentives\x18\x01 \x03(\x0b\x32\x1e.evmos.incentives.v1.IncentiveB\x04\xc8\xde\x1f\x00R\nincentives\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"3\n\x15QueryIncentiveRequest\x12\x1a\n\x08\x63ontract\x18\x01 \x01(\tR\x08\x63ontract\"\\\n\x16QueryIncentiveResponse\x12\x42\n\tincentive\x18\x01 \x01(\x0b\x32\x1e.evmos.incentives.v1.IncentiveB\x04\xc8\xde\x1f\x00R\tincentive\"{\n\x15QueryGasMetersRequest\x12\x1a\n\x08\x63ontract\x18\x01 \x01(\tR\x08\x63ontract\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xa5\x01\n\x16QueryGasMetersResponse\x12\x42\n\ngas_meters\x18\x01 \x03(\x0b\x32\x1d.evmos.incentives.v1.GasMeterB\x04\xc8\xde\x1f\x00R\tgasMeters\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"T\n\x14QueryGasMeterRequest\x12\x1a\n\x08\x63ontract\x18\x01 \x01(\tR\x08\x63ontract\x12 \n\x0bparticipant\x18\x02 \x01(\tR\x0bparticipant\"4\n\x15QueryGasMeterResponse\x12\x1b\n\tgas_meter\x18\x01 \x01(\x04R\x08gasMeter\"f\n\x1cQueryAllocationMetersRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xe8\x01\n\x1dQueryAllocationMetersResponse\x12~\n\x11\x61llocation_meters\x18\x01 \x03(\x0b\x32\x1c.cosmos.base.v1beta1.DecCoinB3\xc8\xde\x1f\x00\xaa\xdf\x1f+github.com/cosmos/cosmos-sdk/types.DecCoinsR\x10\x61llocationMeters\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"3\n\x1bQueryAllocationMeterRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"\x9c\x01\n\x1cQueryAllocationMeterResponse\x12|\n\x10\x61llocation_meter\x18\x01 \x01(\x0b\x32\x1c.cosmos.base.v1beta1.DecCoinB3\xc8\xde\x1f\x00\xaa\xdf\x1f+github.com/cosmos/cosmos-sdk/types.DecCoinsR\x0f\x61llocationMeter\"\x14\n\x12QueryParamsRequest\"P\n\x13QueryParamsResponse\x12\x39\n\x06params\x18\x01 \x01(\x0b\x32\x1b.evmos.incentives.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params2\xd6\x08\n\x05Query\x12\x90\x01\n\nIncentives\x12+.evmos.incentives.v1.QueryIncentivesRequest\x1a,.evmos.incentives.v1.QueryIncentivesResponse\"\'\x82\xd3\xe4\x93\x02!\x12\x1f/evmos/incentives/v1/incentives\x12\x98\x01\n\tIncentive\x12*.evmos.incentives.v1.QueryIncentiveRequest\x1a+.evmos.incentives.v1.QueryIncentiveResponse\"2\x82\xd3\xe4\x93\x02,\x12*/evmos/incentives/v1/incentives/{contract}\x12\x98\x01\n\tGasMeters\x12*.evmos.incentives.v1.QueryGasMetersRequest\x1a+.evmos.incentives.v1.QueryGasMetersResponse\"2\x82\xd3\xe4\x93\x02,\x12*/evmos/incentives/v1/gas_meters/{contract}\x12\xa3\x01\n\x08GasMeter\x12).evmos.incentives.v1.QueryGasMeterRequest\x1a*.evmos.incentives.v1.QueryGasMeterResponse\"@\x82\xd3\xe4\x93\x02:\x12\x38/evmos/incentives/v1/gas_meters/{contract}/{participant}\x12\xa9\x01\n\x10\x41llocationMeters\x12\x31.evmos.incentives.v1.QueryAllocationMetersRequest\x1a\x32.evmos.incentives.v1.QueryAllocationMetersResponse\".\x82\xd3\xe4\x93\x02(\x12&/evmos/incentives/v1/allocation_meters\x12\xae\x01\n\x0f\x41llocationMeter\x12\x30.evmos.incentives.v1.QueryAllocationMeterRequest\x1a\x31.evmos.incentives.v1.QueryAllocationMeterResponse\"6\x82\xd3\xe4\x93\x02\x30\x12./evmos/incentives/v1/allocation_meters/{denom}\x12\x80\x01\n\x06Params\x12\'.evmos.incentives.v1.QueryParamsRequest\x1a(.evmos.incentives.v1.QueryParamsResponse\"#\x82\xd3\xe4\x93\x02\x1d\x12\x1b/evmos/incentives/v1/paramsB\xc2\x01\n\x17\x63om.evmos.incentives.v1B\nQueryProtoP\x01Z-github.com/evmos/evmos/v13/x/incentives/types\xa2\x02\x03\x45IX\xaa\x02\x13\x45vmos.Incentives.V1\xca\x02\x13\x45vmos\\Incentives\\V1\xe2\x02\x1f\x45vmos\\Incentives\\V1\\GPBMetadata\xea\x02\x15\x45vmos::Incentives::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'evmos.incentives.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.evmos.incentives.v1B\nQueryProtoP\001Z-github.com/evmos/evmos/v13/x/incentives/types\242\002\003EIX\252\002\023Evmos.Incentives.V1\312\002\023Evmos\\Incentives\\V1\342\002\037Evmos\\Incentives\\V1\\GPBMetadata\352\002\025Evmos::Incentives::V1'
  _QUERYINCENTIVESRESPONSE.fields_by_name['incentives']._options = None
  _QUERYINCENTIVESRESPONSE.fields_by_name['incentives']._serialized_options = b'\310\336\037\000'
  _QUERYINCENTIVERESPONSE.fields_by_name['incentive']._options = None
  _QUERYINCENTIVERESPONSE.fields_by_name['incentive']._serialized_options = b'\310\336\037\000'
  _QUERYGASMETERSRESPONSE.fields_by_name['gas_meters']._options = None
  _QUERYGASMETERSRESPONSE.fields_by_name['gas_meters']._serialized_options = b'\310\336\037\000'
  _QUERYALLOCATIONMETERSRESPONSE.fields_by_name['allocation_meters']._options = None
  _QUERYALLOCATIONMETERSRESPONSE.fields_by_name['allocation_meters']._serialized_options = b'\310\336\037\000\252\337\037+github.com/cosmos/cosmos-sdk/types.DecCoins'
  _QUERYALLOCATIONMETERRESPONSE.fields_by_name['allocation_meter']._options = None
  _QUERYALLOCATIONMETERRESPONSE.fields_by_name['allocation_meter']._serialized_options = b'\310\336\037\000\252\337\037+github.com/cosmos/cosmos-sdk/types.DecCoins'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['Incentives']._options = None
  _QUERY.methods_by_name['Incentives']._serialized_options = b'\202\323\344\223\002!\022\037/evmos/incentives/v1/incentives'
  _QUERY.methods_by_name['Incentive']._options = None
  _QUERY.methods_by_name['Incentive']._serialized_options = b'\202\323\344\223\002,\022*/evmos/incentives/v1/incentives/{contract}'
  _QUERY.methods_by_name['GasMeters']._options = None
  _QUERY.methods_by_name['GasMeters']._serialized_options = b'\202\323\344\223\002,\022*/evmos/incentives/v1/gas_meters/{contract}'
  _QUERY.methods_by_name['GasMeter']._options = None
  _QUERY.methods_by_name['GasMeter']._serialized_options = b'\202\323\344\223\002:\0228/evmos/incentives/v1/gas_meters/{contract}/{participant}'
  _QUERY.methods_by_name['AllocationMeters']._options = None
  _QUERY.methods_by_name['AllocationMeters']._serialized_options = b'\202\323\344\223\002(\022&/evmos/incentives/v1/allocation_meters'
  _QUERY.methods_by_name['AllocationMeter']._options = None
  _QUERY.methods_by_name['AllocationMeter']._serialized_options = b'\202\323\344\223\0020\022./evmos/incentives/v1/allocation_meters/{denom}'
  _QUERY.methods_by_name['Params']._options = None
  _QUERY.methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\035\022\033/evmos/incentives/v1/params'
  _globals['_QUERYINCENTIVESREQUEST']._serialized_start=257
  _globals['_QUERYINCENTIVESREQUEST']._serialized_end=353
  _globals['_QUERYINCENTIVESRESPONSE']._serialized_start=356
  _globals['_QUERYINCENTIVESRESPONSE']._serialized_end=524
  _globals['_QUERYINCENTIVEREQUEST']._serialized_start=526
  _globals['_QUERYINCENTIVEREQUEST']._serialized_end=577
  _globals['_QUERYINCENTIVERESPONSE']._serialized_start=579
  _globals['_QUERYINCENTIVERESPONSE']._serialized_end=671
  _globals['_QUERYGASMETERSREQUEST']._serialized_start=673
  _globals['_QUERYGASMETERSREQUEST']._serialized_end=796
  _globals['_QUERYGASMETERSRESPONSE']._serialized_start=799
  _globals['_QUERYGASMETERSRESPONSE']._serialized_end=964
  _globals['_QUERYGASMETERREQUEST']._serialized_start=966
  _globals['_QUERYGASMETERREQUEST']._serialized_end=1050
  _globals['_QUERYGASMETERRESPONSE']._serialized_start=1052
  _globals['_QUERYGASMETERRESPONSE']._serialized_end=1104
  _globals['_QUERYALLOCATIONMETERSREQUEST']._serialized_start=1106
  _globals['_QUERYALLOCATIONMETERSREQUEST']._serialized_end=1208
  _globals['_QUERYALLOCATIONMETERSRESPONSE']._serialized_start=1211
  _globals['_QUERYALLOCATIONMETERSRESPONSE']._serialized_end=1443
  _globals['_QUERYALLOCATIONMETERREQUEST']._serialized_start=1445
  _globals['_QUERYALLOCATIONMETERREQUEST']._serialized_end=1496
  _globals['_QUERYALLOCATIONMETERRESPONSE']._serialized_start=1499
  _globals['_QUERYALLOCATIONMETERRESPONSE']._serialized_end=1655
  _globals['_QUERYPARAMSREQUEST']._serialized_start=1657
  _globals['_QUERYPARAMSREQUEST']._serialized_end=1677
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=1679
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=1759
  _globals['_QUERY']._serialized_start=1762
  _globals['_QUERY']._serialized_end=2872
# @@protoc_insertion_point(module_scope)
