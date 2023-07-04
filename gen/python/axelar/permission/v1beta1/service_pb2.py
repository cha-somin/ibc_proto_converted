# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/permission/v1beta1/service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from axelar.permission.v1beta1 import tx_pb2 as axelar_dot_permission_dot_v1beta1_dot_tx__pb2
from axelar.permission.v1beta1 import query_pb2 as axelar_dot_permission_dot_v1beta1_dot_query__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'axelar/permission/v1beta1/service.proto\x12\x19\x61xelar.permission.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\"axelar/permission/v1beta1/tx.proto\x1a%axelar/permission/v1beta1/query.proto2\xb7\x04\n\x03Msg\x12\xb4\x01\n\x12RegisterController\x12\x34.axelar.permission.v1beta1.RegisterControllerRequest\x1a\x35.axelar.permission.v1beta1.RegisterControllerResponse\"1\x82\xd3\xe4\x93\x02+\"&/axelar/permission/register_controller:\x01*\x12\xbc\x01\n\x14\x44\x65registerController\x12\x36.axelar.permission.v1beta1.DeregisterControllerRequest\x1a\x37.axelar.permission.v1beta1.DeregisterControllerResponse\"3\x82\xd3\xe4\x93\x02-\"(/axelar/permission/deregister_controller:\x01*\x12\xb9\x01\n\x13UpdateGovernanceKey\x12\x35.axelar.permission.v1beta1.UpdateGovernanceKeyRequest\x1a\x36.axelar.permission.v1beta1.UpdateGovernanceKeyResponse\"3\x82\xd3\xe4\x93\x02-\"(/axelar/permission/update_governance_key:\x01*2\xb9\x01\n\x05Query\x12\xaf\x01\n\rGovernanceKey\x12\x34.axelar.permission.v1beta1.QueryGovernanceKeyRequest\x1a\x35.axelar.permission.v1beta1.QueryGovernanceKeyResponse\"1\x82\xd3\xe4\x93\x02+\x12)/axelar/permission/v1beta1/governance_keyB\xf0\x01\n\x1d\x63om.axelar.permission.v1beta1B\x0cServiceProtoP\x01Z7github.com/axelarnetwork/axelar-core/x/permission/types\xa2\x02\x03\x41PX\xaa\x02\x19\x41xelar.Permission.V1beta1\xca\x02\x19\x41xelar\\Permission\\V1beta1\xe2\x02%Axelar\\Permission\\V1beta1\\GPBMetadata\xea\x02\x1b\x41xelar::Permission::V1beta1\xc0\xe3\x1e\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.permission.v1beta1.service_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.axelar.permission.v1beta1B\014ServiceProtoP\001Z7github.com/axelarnetwork/axelar-core/x/permission/types\242\002\003APX\252\002\031Axelar.Permission.V1beta1\312\002\031Axelar\\Permission\\V1beta1\342\002%Axelar\\Permission\\V1beta1\\GPBMetadata\352\002\033Axelar::Permission::V1beta1\300\343\036\001'
  _MSG.methods_by_name['RegisterController']._options = None
  _MSG.methods_by_name['RegisterController']._serialized_options = b'\202\323\344\223\002+\"&/axelar/permission/register_controller:\001*'
  _MSG.methods_by_name['DeregisterController']._options = None
  _MSG.methods_by_name['DeregisterController']._serialized_options = b'\202\323\344\223\002-\"(/axelar/permission/deregister_controller:\001*'
  _MSG.methods_by_name['UpdateGovernanceKey']._options = None
  _MSG.methods_by_name['UpdateGovernanceKey']._serialized_options = b'\202\323\344\223\002-\"(/axelar/permission/update_governance_key:\001*'
  _QUERY.methods_by_name['GovernanceKey']._options = None
  _QUERY.methods_by_name['GovernanceKey']._serialized_options = b'\202\323\344\223\002+\022)/axelar/permission/v1beta1/governance_key'
  _globals['_MSG']._serialized_start=198
  _globals['_MSG']._serialized_end=765
  _globals['_QUERY']._serialized_start=768
  _globals['_QUERY']._serialized_end=953
# @@protoc_insertion_point(module_scope)