# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: quicksilver/participationrewards/v1/proposals.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3quicksilver/participationrewards/v1/proposals.proto\x12#quicksilver.participationrewards.v1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1cgoogle/api/annotations.proto\"\xe7\x01\n\x17\x41\x64\x64ProtocolDataProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12#\n\x04type\x18\x04 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"type\"R\x04type\x12?\n\x04\x64\x61ta\x18\x05 \x01(\tB+\xf2\xde\x1f\x0byaml:\"data\"\xfa\xde\x1f\x18\x65ncoding/json.RawMessageR\x04\x64\x61ta\x12 \n\x03key\x18\x06 \x01(\tB\x0e\xf2\xde\x1f\nyaml:\"key\"R\x03key:\x0c\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xcd\x02\n\"AddProtocolDataProposalWithDeposit\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12/\n\x08protocol\x18\x03 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"protocol\"R\x08protocol\x12#\n\x04type\x18\x04 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"type\"R\x04type\x12 \n\x03key\x18\x05 \x01(\tB\x0e\xf2\xde\x1f\nyaml:\"key\"R\x03key\x12?\n\x04\x64\x61ta\x18\x06 \x01(\x0c\x42+\xf2\xde\x1f\x0byaml:\"data\"\xfa\xde\x1f\x18\x65ncoding/json.RawMessageR\x04\x64\x61ta\x12,\n\x07\x64\x65posit\x18\x07 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"deposit\"R\x07\x64\x65posit:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x42\xac\x02\n\'com.quicksilver.participationrewards.v1B\x0eProposalsProtoP\x01ZCgithub.com/ingenuity-build/quicksilver/x/participationrewards/types\xa2\x02\x03QPX\xaa\x02#Quicksilver.Participationrewards.V1\xca\x02#Quicksilver\\Participationrewards\\V1\xe2\x02/Quicksilver\\Participationrewards\\V1\\GPBMetadata\xea\x02%Quicksilver::Participationrewards::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'quicksilver.participationrewards.v1.proposals_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\'com.quicksilver.participationrewards.v1B\016ProposalsProtoP\001ZCgithub.com/ingenuity-build/quicksilver/x/participationrewards/types\242\002\003QPX\252\002#Quicksilver.Participationrewards.V1\312\002#Quicksilver\\Participationrewards\\V1\342\002/Quicksilver\\Participationrewards\\V1\\GPBMetadata\352\002%Quicksilver::Participationrewards::V1'
  _ADDPROTOCOLDATAPROPOSAL.fields_by_name['type']._options = None
  _ADDPROTOCOLDATAPROPOSAL.fields_by_name['type']._serialized_options = b'\362\336\037\013yaml:\"type\"'
  _ADDPROTOCOLDATAPROPOSAL.fields_by_name['data']._options = None
  _ADDPROTOCOLDATAPROPOSAL.fields_by_name['data']._serialized_options = b'\362\336\037\013yaml:\"data\"\372\336\037\030encoding/json.RawMessage'
  _ADDPROTOCOLDATAPROPOSAL.fields_by_name['key']._options = None
  _ADDPROTOCOLDATAPROPOSAL.fields_by_name['key']._serialized_options = b'\362\336\037\nyaml:\"key\"'
  _ADDPROTOCOLDATAPROPOSAL._options = None
  _ADDPROTOCOLDATAPROPOSAL._serialized_options = b'\210\240\037\000\230\240\037\000\350\240\037\000'
  _ADDPROTOCOLDATAPROPOSALWITHDEPOSIT.fields_by_name['protocol']._options = None
  _ADDPROTOCOLDATAPROPOSALWITHDEPOSIT.fields_by_name['protocol']._serialized_options = b'\362\336\037\017yaml:\"protocol\"'
  _ADDPROTOCOLDATAPROPOSALWITHDEPOSIT.fields_by_name['type']._options = None
  _ADDPROTOCOLDATAPROPOSALWITHDEPOSIT.fields_by_name['type']._serialized_options = b'\362\336\037\013yaml:\"type\"'
  _ADDPROTOCOLDATAPROPOSALWITHDEPOSIT.fields_by_name['key']._options = None
  _ADDPROTOCOLDATAPROPOSALWITHDEPOSIT.fields_by_name['key']._serialized_options = b'\362\336\037\nyaml:\"key\"'
  _ADDPROTOCOLDATAPROPOSALWITHDEPOSIT.fields_by_name['data']._options = None
  _ADDPROTOCOLDATAPROPOSALWITHDEPOSIT.fields_by_name['data']._serialized_options = b'\362\336\037\013yaml:\"data\"\372\336\037\030encoding/json.RawMessage'
  _ADDPROTOCOLDATAPROPOSALWITHDEPOSIT.fields_by_name['deposit']._options = None
  _ADDPROTOCOLDATAPROPOSALWITHDEPOSIT.fields_by_name['deposit']._serialized_options = b'\362\336\037\016yaml:\"deposit\"'
  _ADDPROTOCOLDATAPROPOSALWITHDEPOSIT._options = None
  _ADDPROTOCOLDATAPROPOSALWITHDEPOSIT._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_ADDPROTOCOLDATAPROPOSAL']._serialized_start=172
  _globals['_ADDPROTOCOLDATAPROPOSAL']._serialized_end=403
  _globals['_ADDPROTOCOLDATAPROPOSALWITHDEPOSIT']._serialized_start=406
  _globals['_ADDPROTOCOLDATAPROPOSALWITHDEPOSIT']._serialized_end=739
# @@protoc_insertion_point(module_scope)
