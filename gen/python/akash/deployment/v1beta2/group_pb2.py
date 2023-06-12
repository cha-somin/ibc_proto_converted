# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/deployment/v1beta2/group.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from akash.deployment.v1beta2 import groupid_pb2 as akash_dot_deployment_dot_v1beta2_dot_groupid__pb2
from akash.deployment.v1beta2 import groupspec_pb2 as akash_dot_deployment_dot_v1beta2_dot_groupspec__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$akash/deployment/v1beta2/group.proto\x12\x18\x61kash.deployment.v1beta2\x1a\x14gogoproto/gogo.proto\x1a&akash/deployment/v1beta2/groupid.proto\x1a(akash/deployment/v1beta2/groupspec.proto\"\x82\x04\n\x05Group\x12`\n\x08group_id\x18\x01 \x01(\x0b\x32!.akash.deployment.v1beta2.GroupIDB\"\xc8\xde\x1f\x00\xe2\xde\x1f\x07GroupID\xea\xde\x1f\x02id\xf2\xde\x1f\tyaml:\"id\"R\x07groupId\x12V\n\x05state\x18\x02 \x01(\x0e\x32%.akash.deployment.v1beta2.Group.StateB\x19\xea\xde\x1f\x05state\xf2\xde\x1f\x0cyaml:\"state\"R\x05state\x12_\n\ngroup_spec\x18\x03 \x01(\x0b\x32#.akash.deployment.v1beta2.GroupSpecB\x1b\xc8\xde\x1f\x00\xea\xde\x1f\x04spec\xf2\xde\x1f\x0byaml:\"spec\"R\tgroupSpec\x12\x1d\n\ncreated_at\x18\x04 \x01(\x03R\tcreatedAt\"\xb8\x01\n\x05State\x12\"\n\x07invalid\x10\x00\x1a\x15\x8a\x9d \x11GroupStateInvalid\x12\x17\n\x04open\x10\x01\x1a\r\x8a\x9d \tGroupOpen\x12\x1b\n\x06paused\x10\x02\x1a\x0f\x8a\x9d \x0bGroupPaused\x12\x32\n\x12insufficient_funds\x10\x03\x1a\x1a\x8a\x9d \x16GroupInsufficientFunds\x12\x1b\n\x06\x63losed\x10\x04\x1a\x0f\x8a\x9d \x0bGroupClosed\x1a\x04\x88\xa3\x1e\x00:\x04\xe8\xa0\x1f\x00\x42\xeb\x01\n\x1c\x63om.akash.deployment.v1beta2B\nGroupProtoP\x01Z=github.com/akash-network/akash-api/go/node/deployment/v1beta2\xa2\x02\x03\x41\x44X\xaa\x02\x18\x41kash.Deployment.V1beta2\xca\x02\x18\x41kash\\Deployment\\V1beta2\xe2\x02$Akash\\Deployment\\V1beta2\\GPBMetadata\xea\x02\x1a\x41kash::Deployment::V1beta2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.deployment.v1beta2.group_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.akash.deployment.v1beta2B\nGroupProtoP\001Z=github.com/akash-network/akash-api/go/node/deployment/v1beta2\242\002\003ADX\252\002\030Akash.Deployment.V1beta2\312\002\030Akash\\Deployment\\V1beta2\342\002$Akash\\Deployment\\V1beta2\\GPBMetadata\352\002\032Akash::Deployment::V1beta2'
  _GROUP_STATE._options = None
  _GROUP_STATE._serialized_options = b'\210\243\036\000'
  _GROUP_STATE.values_by_name["invalid"]._options = None
  _GROUP_STATE.values_by_name["invalid"]._serialized_options = b'\212\235 \021GroupStateInvalid'
  _GROUP_STATE.values_by_name["open"]._options = None
  _GROUP_STATE.values_by_name["open"]._serialized_options = b'\212\235 \tGroupOpen'
  _GROUP_STATE.values_by_name["paused"]._options = None
  _GROUP_STATE.values_by_name["paused"]._serialized_options = b'\212\235 \013GroupPaused'
  _GROUP_STATE.values_by_name["insufficient_funds"]._options = None
  _GROUP_STATE.values_by_name["insufficient_funds"]._serialized_options = b'\212\235 \026GroupInsufficientFunds'
  _GROUP_STATE.values_by_name["closed"]._options = None
  _GROUP_STATE.values_by_name["closed"]._serialized_options = b'\212\235 \013GroupClosed'
  _GROUP.fields_by_name['group_id']._options = None
  _GROUP.fields_by_name['group_id']._serialized_options = b'\310\336\037\000\342\336\037\007GroupID\352\336\037\002id\362\336\037\tyaml:\"id\"'
  _GROUP.fields_by_name['state']._options = None
  _GROUP.fields_by_name['state']._serialized_options = b'\352\336\037\005state\362\336\037\014yaml:\"state\"'
  _GROUP.fields_by_name['group_spec']._options = None
  _GROUP.fields_by_name['group_spec']._serialized_options = b'\310\336\037\000\352\336\037\004spec\362\336\037\013yaml:\"spec\"'
  _GROUP._options = None
  _GROUP._serialized_options = b'\350\240\037\000'
  _globals['_GROUP']._serialized_start=171
  _globals['_GROUP']._serialized_end=685
  _globals['_GROUP_STATE']._serialized_start=495
  _globals['_GROUP_STATE']._serialized_end=679
# @@protoc_insertion_point(module_scope)
