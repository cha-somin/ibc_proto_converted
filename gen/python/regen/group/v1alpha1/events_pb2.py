# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: regen/group/v1alpha1/events.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!regen/group/v1alpha1/events.proto\x12\x14regen.group.v1alpha1\"-\n\x10\x45ventCreateGroup\x12\x19\n\x08group_id\x18\x01 \x01(\x04R\x07groupId\"-\n\x10\x45ventUpdateGroup\x12\x19\n\x08group_id\x18\x01 \x01(\x04R\x07groupId\"3\n\x17\x45ventCreateGroupAccount\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\"3\n\x17\x45ventUpdateGroupAccount\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\"6\n\x13\x45ventCreateProposal\x12\x1f\n\x0bproposal_id\x18\x01 \x01(\x04R\nproposalId\",\n\tEventVote\x12\x1f\n\x0bproposal_id\x18\x01 \x01(\x04R\nproposalId\",\n\tEventExec\x12\x1f\n\x0bproposal_id\x18\x01 \x01(\x04R\nproposalIdB\xc8\x01\n\x18\x63om.regen.group.v1alpha1B\x0b\x45ventsProtoP\x01Z-github.com/regen-network/regen-ledger/x/group\xa2\x02\x03RGX\xaa\x02\x14Regen.Group.V1alpha1\xca\x02\x14Regen\\Group\\V1alpha1\xe2\x02 Regen\\Group\\V1alpha1\\GPBMetadata\xea\x02\x16Regen::Group::V1alpha1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'regen.group.v1alpha1.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.regen.group.v1alpha1B\013EventsProtoP\001Z-github.com/regen-network/regen-ledger/x/group\242\002\003RGX\252\002\024Regen.Group.V1alpha1\312\002\024Regen\\Group\\V1alpha1\342\002 Regen\\Group\\V1alpha1\\GPBMetadata\352\002\026Regen::Group::V1alpha1'
  _globals['_EVENTCREATEGROUP']._serialized_start=59
  _globals['_EVENTCREATEGROUP']._serialized_end=104
  _globals['_EVENTUPDATEGROUP']._serialized_start=106
  _globals['_EVENTUPDATEGROUP']._serialized_end=151
  _globals['_EVENTCREATEGROUPACCOUNT']._serialized_start=153
  _globals['_EVENTCREATEGROUPACCOUNT']._serialized_end=204
  _globals['_EVENTUPDATEGROUPACCOUNT']._serialized_start=206
  _globals['_EVENTUPDATEGROUPACCOUNT']._serialized_end=257
  _globals['_EVENTCREATEPROPOSAL']._serialized_start=259
  _globals['_EVENTCREATEPROPOSAL']._serialized_end=313
  _globals['_EVENTVOTE']._serialized_start=315
  _globals['_EVENTVOTE']._serialized_end=359
  _globals['_EVENTEXEC']._serialized_start=361
  _globals['_EVENTEXEC']._serialized_end=405
# @@protoc_insertion_point(module_scope)
