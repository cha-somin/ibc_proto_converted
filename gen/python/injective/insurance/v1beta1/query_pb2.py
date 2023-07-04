# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: injective/insurance/v1beta1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from injective.insurance.v1beta1 import insurance_pb2 as injective_dot_insurance_dot_v1beta1_dot_insurance__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from injective.insurance.v1beta1 import genesis_pb2 as injective_dot_insurance_dot_v1beta1_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'injective/insurance/v1beta1/query.proto\x12\x1binjective.insurance.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a+injective/insurance/v1beta1/insurance.proto\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a)injective/insurance/v1beta1/genesis.proto\"\x1d\n\x1bQueryInsuranceParamsRequest\"a\n\x1cQueryInsuranceParamsResponse\x12\x41\n\x06params\x18\x01 \x01(\x0b\x32#.injective.insurance.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"8\n\x19QueryInsuranceFundRequest\x12\x1b\n\tmarket_id\x18\x01 \x01(\tR\x08marketId\"\\\n\x1aQueryInsuranceFundResponse\x12>\n\x04\x66und\x18\x01 \x01(\x0b\x32*.injective.insurance.v1beta1.InsuranceFundR\x04\x66und\"\x1c\n\x1aQueryInsuranceFundsRequest\"e\n\x1bQueryInsuranceFundsResponse\x12\x46\n\x05\x66unds\x18\x01 \x03(\x0b\x32*.injective.insurance.v1beta1.InsuranceFundB\x04\xc8\xde\x1f\x00R\x05\x66unds\"X\n QueryEstimatedRedemptionsRequest\x12\x1a\n\x08marketId\x18\x01 \x01(\tR\x08marketId\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"\\\n!QueryEstimatedRedemptionsResponse\x12\x37\n\x06\x61mount\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\"V\n\x1eQueryPendingRedemptionsRequest\x12\x1a\n\x08marketId\x18\x01 \x01(\tR\x08marketId\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"Z\n\x1fQueryPendingRedemptionsResponse\x12\x37\n\x06\x61mount\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\"\x19\n\x17QueryModuleStateRequest\"[\n\x18QueryModuleStateResponse\x12?\n\x05state\x18\x01 \x01(\x0b\x32).injective.insurance.v1beta1.GenesisStateR\x05state2\x96\t\n\x05Query\x12\xb3\x01\n\x0fInsuranceParams\x12\x38.injective.insurance.v1beta1.QueryInsuranceParamsRequest\x1a\x39.injective.insurance.v1beta1.QueryInsuranceParamsResponse\"+\x82\xd3\xe4\x93\x02%\x12#/injective/insurance/v1beta1/params\x12\xc1\x01\n\rInsuranceFund\x12\x36.injective.insurance.v1beta1.QueryInsuranceFundRequest\x1a\x37.injective.insurance.v1beta1.QueryInsuranceFundResponse\"?\x82\xd3\xe4\x93\x02\x39\x12\x37/injective/insurance/v1beta1/insurance_fund/{market_id}\x12\xb9\x01\n\x0eInsuranceFunds\x12\x37.injective.insurance.v1beta1.QueryInsuranceFundsRequest\x1a\x38.injective.insurance.v1beta1.QueryInsuranceFundsResponse\"4\x82\xd3\xe4\x93\x02.\x12,/injective/insurance/v1beta1/insurance_funds\x12\xd1\x01\n\x14\x45stimatedRedemptions\x12=.injective.insurance.v1beta1.QueryEstimatedRedemptionsRequest\x1a>.injective.insurance.v1beta1.QueryEstimatedRedemptionsResponse\":\x82\xd3\xe4\x93\x02\x34\x12\x32/injective/insurance/v1beta1/estimated_redemptions\x12\xc9\x01\n\x12PendingRedemptions\x12;.injective.insurance.v1beta1.QueryPendingRedemptionsRequest\x1a<.injective.insurance.v1beta1.QueryPendingRedemptionsResponse\"8\x82\xd3\xe4\x93\x02\x32\x12\x30/injective/insurance/v1beta1/pending_redemptions\x12\xb6\x01\n\x14InsuranceModuleState\x12\x34.injective.insurance.v1beta1.QueryModuleStateRequest\x1a\x35.injective.insurance.v1beta1.QueryModuleStateResponse\"1\x82\xd3\xe4\x93\x02+\x12)/injective/insurance/v1beta1/module_stateB\x8c\x02\n\x1f\x63om.injective.insurance.v1beta1B\nQueryProtoP\x01ZOgithub.com/InjectiveLabs/injective-core/injective-chain/modules/insurance/types\xa2\x02\x03IIX\xaa\x02\x1bInjective.Insurance.V1beta1\xca\x02\x1bInjective\\Insurance\\V1beta1\xe2\x02\'Injective\\Insurance\\V1beta1\\GPBMetadata\xea\x02\x1dInjective::Insurance::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'injective.insurance.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.injective.insurance.v1beta1B\nQueryProtoP\001ZOgithub.com/InjectiveLabs/injective-core/injective-chain/modules/insurance/types\242\002\003IIX\252\002\033Injective.Insurance.V1beta1\312\002\033Injective\\Insurance\\V1beta1\342\002\'Injective\\Insurance\\V1beta1\\GPBMetadata\352\002\035Injective::Insurance::V1beta1'
  _QUERYINSURANCEPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYINSURANCEPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERYINSURANCEFUNDSRESPONSE.fields_by_name['funds']._options = None
  _QUERYINSURANCEFUNDSRESPONSE.fields_by_name['funds']._serialized_options = b'\310\336\037\000'
  _QUERYESTIMATEDREDEMPTIONSRESPONSE.fields_by_name['amount']._options = None
  _QUERYESTIMATEDREDEMPTIONSRESPONSE.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _QUERYPENDINGREDEMPTIONSRESPONSE.fields_by_name['amount']._options = None
  _QUERYPENDINGREDEMPTIONSRESPONSE.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['InsuranceParams']._options = None
  _QUERY.methods_by_name['InsuranceParams']._serialized_options = b'\202\323\344\223\002%\022#/injective/insurance/v1beta1/params'
  _QUERY.methods_by_name['InsuranceFund']._options = None
  _QUERY.methods_by_name['InsuranceFund']._serialized_options = b'\202\323\344\223\0029\0227/injective/insurance/v1beta1/insurance_fund/{market_id}'
  _QUERY.methods_by_name['InsuranceFunds']._options = None
  _QUERY.methods_by_name['InsuranceFunds']._serialized_options = b'\202\323\344\223\002.\022,/injective/insurance/v1beta1/insurance_funds'
  _QUERY.methods_by_name['EstimatedRedemptions']._options = None
  _QUERY.methods_by_name['EstimatedRedemptions']._serialized_options = b'\202\323\344\223\0024\0222/injective/insurance/v1beta1/estimated_redemptions'
  _QUERY.methods_by_name['PendingRedemptions']._options = None
  _QUERY.methods_by_name['PendingRedemptions']._serialized_options = b'\202\323\344\223\0022\0220/injective/insurance/v1beta1/pending_redemptions'
  _QUERY.methods_by_name['InsuranceModuleState']._options = None
  _QUERY.methods_by_name['InsuranceModuleState']._serialized_options = b'\202\323\344\223\002+\022)/injective/insurance/v1beta1/module_state'
  _globals['_QUERYINSURANCEPARAMSREQUEST']._serialized_start=244
  _globals['_QUERYINSURANCEPARAMSREQUEST']._serialized_end=273
  _globals['_QUERYINSURANCEPARAMSRESPONSE']._serialized_start=275
  _globals['_QUERYINSURANCEPARAMSRESPONSE']._serialized_end=372
  _globals['_QUERYINSURANCEFUNDREQUEST']._serialized_start=374
  _globals['_QUERYINSURANCEFUNDREQUEST']._serialized_end=430
  _globals['_QUERYINSURANCEFUNDRESPONSE']._serialized_start=432
  _globals['_QUERYINSURANCEFUNDRESPONSE']._serialized_end=524
  _globals['_QUERYINSURANCEFUNDSREQUEST']._serialized_start=526
  _globals['_QUERYINSURANCEFUNDSREQUEST']._serialized_end=554
  _globals['_QUERYINSURANCEFUNDSRESPONSE']._serialized_start=556
  _globals['_QUERYINSURANCEFUNDSRESPONSE']._serialized_end=657
  _globals['_QUERYESTIMATEDREDEMPTIONSREQUEST']._serialized_start=659
  _globals['_QUERYESTIMATEDREDEMPTIONSREQUEST']._serialized_end=747
  _globals['_QUERYESTIMATEDREDEMPTIONSRESPONSE']._serialized_start=749
  _globals['_QUERYESTIMATEDREDEMPTIONSRESPONSE']._serialized_end=841
  _globals['_QUERYPENDINGREDEMPTIONSREQUEST']._serialized_start=843
  _globals['_QUERYPENDINGREDEMPTIONSREQUEST']._serialized_end=929
  _globals['_QUERYPENDINGREDEMPTIONSRESPONSE']._serialized_start=931
  _globals['_QUERYPENDINGREDEMPTIONSRESPONSE']._serialized_end=1021
  _globals['_QUERYMODULESTATEREQUEST']._serialized_start=1023
  _globals['_QUERYMODULESTATEREQUEST']._serialized_end=1048
  _globals['_QUERYMODULESTATERESPONSE']._serialized_start=1050
  _globals['_QUERYMODULESTATERESPONSE']._serialized_end=1141
  _globals['_QUERY']._serialized_start=1144
  _globals['_QUERY']._serialized_end=2318
# @@protoc_insertion_point(module_scope)