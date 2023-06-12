# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: neutron/feerefunder/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from neutron.feerefunder import params_pb2 as neutron_dot_feerefunder_dot_params__pb2
from neutron.feerefunder import genesis_pb2 as neutron_dot_feerefunder_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fneutron/feerefunder/query.proto\x12\x13neutron.feerefunder\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a neutron/feerefunder/params.proto\x1a!neutron/feerefunder/genesis.proto\"\x14\n\x12QueryParamsRequest\"P\n\x13QueryParamsResponse\x12\x39\n\x06params\x18\x01 \x01(\x0b\x32\x1b.neutron.feerefunder.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"d\n\x0e\x46\x65\x65InfoRequest\x12\x1d\n\nchannel_id\x18\x01 \x01(\tR\tchannelId\x12\x17\n\x07port_id\x18\x02 \x01(\tR\x06portId\x12\x1a\n\x08sequence\x18\x03 \x01(\x04R\x08sequence\"J\n\x0f\x46\x65\x65InfoResponse\x12\x37\n\x08\x66\x65\x65_info\x18\x01 \x01(\x0b\x32\x1c.neutron.feerefunder.FeeInfoR\x07\x66\x65\x65Info2\x9c\x02\n\x05Query\x12\x8c\x01\n\x06Params\x12\'.neutron.feerefunder.QueryParamsRequest\x1a(.neutron.feerefunder.QueryParamsResponse\"/\x82\xd3\xe4\x93\x02)\x12\'/neutron-org/neutron/feerefunder/params\x12\x83\x01\n\x07\x46\x65\x65Info\x12#.neutron.feerefunder.FeeInfoRequest\x1a$.neutron.feerefunder.FeeInfoResponse\"-\x82\xd3\xe4\x93\x02\'\x12%/neutron-org/neutron/feerefunder/infoB\xc6\x01\n\x17\x63om.neutron.feerefunderB\nQueryProtoP\x01Z2github.com/neutron-org/neutron/x/feerefunder/types\xa2\x02\x03NFX\xaa\x02\x13Neutron.Feerefunder\xca\x02\x13Neutron\\Feerefunder\xe2\x02\x1fNeutron\\Feerefunder\\GPBMetadata\xea\x02\x14Neutron::Feerefunderb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'neutron.feerefunder.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.neutron.feerefunderB\nQueryProtoP\001Z2github.com/neutron-org/neutron/x/feerefunder/types\242\002\003NFX\252\002\023Neutron.Feerefunder\312\002\023Neutron\\Feerefunder\342\002\037Neutron\\Feerefunder\\GPBMetadata\352\002\024Neutron::Feerefunder'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['Params']._options = None
  _QUERY.methods_by_name['Params']._serialized_options = b'\202\323\344\223\002)\022\'/neutron-org/neutron/feerefunder/params'
  _QUERY.methods_by_name['FeeInfo']._options = None
  _QUERY.methods_by_name['FeeInfo']._serialized_options = b'\202\323\344\223\002\'\022%/neutron-org/neutron/feerefunder/info'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=221
  _globals['_QUERYPARAMSREQUEST']._serialized_end=241
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=243
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=323
  _globals['_FEEINFOREQUEST']._serialized_start=325
  _globals['_FEEINFOREQUEST']._serialized_end=425
  _globals['_FEEINFORESPONSE']._serialized_start=427
  _globals['_FEEINFORESPONSE']._serialized_end=501
  _globals['_QUERY']._serialized_start=504
  _globals['_QUERY']._serialized_end=788
# @@protoc_insertion_point(module_scope)
