# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stride/stakeibc/gov.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from stride.stakeibc import validator_pb2 as stride_dot_stakeibc_dot_validator__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19stride/stakeibc/gov.proto\x12\x0fstride.stakeibc\x1a\x14gogoproto/gogo.proto\x1a\x1fstride/stakeibc/validator.proto\"\xe4\x01\n\x15\x41\x64\x64ValidatorsProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x1b\n\thost_zone\x18\x03 \x01(\tR\x08hostZone\x12:\n\nvalidators\x18\x04 \x03(\x0b\x32\x1a.stride.stakeibc.ValidatorR\nvalidators\x12,\n\x07\x64\x65posit\x18\x06 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"deposit\"R\x07\x64\x65posit:\x0c\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\x42\xaf\x01\n\x13\x63om.stride.stakeibcB\x08GovProtoP\x01Z1github.com/Stride-Labs/stride/v9/x/stakeibc/types\xa2\x02\x03SSX\xaa\x02\x0fStride.Stakeibc\xca\x02\x0fStride\\Stakeibc\xe2\x02\x1bStride\\Stakeibc\\GPBMetadata\xea\x02\x10Stride::Stakeibcb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stride.stakeibc.gov_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\023com.stride.stakeibcB\010GovProtoP\001Z1github.com/Stride-Labs/stride/v9/x/stakeibc/types\242\002\003SSX\252\002\017Stride.Stakeibc\312\002\017Stride\\Stakeibc\342\002\033Stride\\Stakeibc\\GPBMetadata\352\002\020Stride::Stakeibc'
  _ADDVALIDATORSPROPOSAL.fields_by_name['deposit']._options = None
  _ADDVALIDATORSPROPOSAL.fields_by_name['deposit']._serialized_options = b'\362\336\037\016yaml:\"deposit\"'
  _ADDVALIDATORSPROPOSAL._options = None
  _ADDVALIDATORSPROPOSAL._serialized_options = b'\210\240\037\000\230\240\037\000\350\240\037\001'
  _globals['_ADDVALIDATORSPROPOSAL']._serialized_start=102
  _globals['_ADDVALIDATORSPROPOSAL']._serialized_end=330
# @@protoc_insertion_point(module_scope)
