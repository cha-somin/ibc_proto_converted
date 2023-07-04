# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: neutron/contractmanager/query.proto
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
from neutron.contractmanager import params_pb2 as neutron_dot_contractmanager_dot_params__pb2
from neutron.contractmanager import genesis_pb2 as neutron_dot_contractmanager_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#neutron/contractmanager/query.proto\x12\x17neutron.contractmanager\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a$neutron/contractmanager/params.proto\x1a%neutron/contractmanager/genesis.proto\"\x14\n\x12QueryParamsRequest\"T\n\x13QueryParamsResponse\x12=\n\x06params\x18\x01 \x01(\x0b\x32\x1f.neutron.contractmanager.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"x\n\x14QueryFailuresRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xa4\x01\n\x15QueryFailuresResponse\x12\x42\n\x08\x66\x61ilures\x18\x01 \x03(\x0b\x32 .neutron.contractmanager.FailureB\x04\xc8\xde\x1f\x00R\x08\x66\x61ilures\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination2\xd5\x03\n\x05Query\x12\x8c\x01\n\x06Params\x12+.neutron.contractmanager.QueryParamsRequest\x1a,.neutron.contractmanager.QueryParamsResponse\"\'\x82\xd3\xe4\x93\x02!\x12\x1f/neutron/contractmanager/params\x12\xa5\x01\n\x0f\x41\x64\x64ressFailures\x12-.neutron.contractmanager.QueryFailuresRequest\x1a..neutron.contractmanager.QueryFailuresResponse\"3\x82\xd3\xe4\x93\x02-\x12+/neutron/contractmanager/failures/{address}\x12\x94\x01\n\x08\x46\x61ilures\x12-.neutron.contractmanager.QueryFailuresRequest\x1a..neutron.contractmanager.QueryFailuresResponse\")\x82\xd3\xe4\x93\x02#\x12!/neutron/contractmanager/failuresB\xde\x01\n\x1b\x63om.neutron.contractmanagerB\nQueryProtoP\x01Z6github.com/neutron-org/neutron/x/contractmanager/types\xa2\x02\x03NCX\xaa\x02\x17Neutron.Contractmanager\xca\x02\x17Neutron\\Contractmanager\xe2\x02#Neutron\\Contractmanager\\GPBMetadata\xea\x02\x18Neutron::Contractmanagerb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'neutron.contractmanager.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.neutron.contractmanagerB\nQueryProtoP\001Z6github.com/neutron-org/neutron/x/contractmanager/types\242\002\003NCX\252\002\027Neutron.Contractmanager\312\002\027Neutron\\Contractmanager\342\002#Neutron\\Contractmanager\\GPBMetadata\352\002\030Neutron::Contractmanager'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERYFAILURESRESPONSE.fields_by_name['failures']._options = None
  _QUERYFAILURESRESPONSE.fields_by_name['failures']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['Params']._options = None
  _QUERY.methods_by_name['Params']._serialized_options = b'\202\323\344\223\002!\022\037/neutron/contractmanager/params'
  _QUERY.methods_by_name['AddressFailures']._options = None
  _QUERY.methods_by_name['AddressFailures']._serialized_options = b'\202\323\344\223\002-\022+/neutron/contractmanager/failures/{address}'
  _QUERY.methods_by_name['Failures']._options = None
  _QUERY.methods_by_name['Failures']._serialized_options = b'\202\323\344\223\002#\022!/neutron/contractmanager/failures'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=237
  _globals['_QUERYPARAMSREQUEST']._serialized_end=257
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=259
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=343
  _globals['_QUERYFAILURESREQUEST']._serialized_start=345
  _globals['_QUERYFAILURESREQUEST']._serialized_end=465
  _globals['_QUERYFAILURESRESPONSE']._serialized_start=468
  _globals['_QUERYFAILURESRESPONSE']._serialized_end=632
  _globals['_QUERY']._serialized_start=635
  _globals['_QUERY']._serialized_end=1104
# @@protoc_insertion_point(module_scope)