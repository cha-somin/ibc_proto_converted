# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/nexus/v1beta1/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from axelar.utils.v1beta1 import threshold_pb2 as axelar_dot_utils_dot_v1beta1_dot_threshold__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!axelar/nexus/v1beta1/params.proto\x12\x14\x61xelar.nexus.v1beta1\x1a\x14gogoproto/gogo.proto\x1a$axelar/utils/v1beta1/threshold.proto\"\xae\x03\n\x06Params\x12\x63\n\x1a\x63hain_activation_threshold\x18\x01 \x01(\x0b\x32\x1f.axelar.utils.v1beta1.ThresholdB\x04\xc8\xde\x1f\x00R\x18\x63hainActivationThreshold\x12{\n\'chain_maintainer_missing_vote_threshold\x18\x02 \x01(\x0b\x32\x1f.axelar.utils.v1beta1.ThresholdB\x04\xc8\xde\x1f\x00R#chainMaintainerMissingVoteThreshold\x12\x7f\n)chain_maintainer_incorrect_vote_threshold\x18\x03 \x01(\x0b\x32\x1f.axelar.utils.v1beta1.ThresholdB\x04\xc8\xde\x1f\x00R%chainMaintainerIncorrectVoteThreshold\x12\x41\n\x1d\x63hain_maintainer_check_window\x18\x04 \x01(\x05R\x1a\x63hainMaintainerCheckWindowB\xd1\x01\n\x18\x63om.axelar.nexus.v1beta1B\x0bParamsProtoP\x01Z2github.com/axelarnetwork/axelar-core/x/nexus/types\xa2\x02\x03\x41NX\xaa\x02\x14\x41xelar.Nexus.V1beta1\xca\x02\x14\x41xelar\\Nexus\\V1beta1\xe2\x02 Axelar\\Nexus\\V1beta1\\GPBMetadata\xea\x02\x16\x41xelar::Nexus::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.nexus.v1beta1.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.axelar.nexus.v1beta1B\013ParamsProtoP\001Z2github.com/axelarnetwork/axelar-core/x/nexus/types\242\002\003ANX\252\002\024Axelar.Nexus.V1beta1\312\002\024Axelar\\Nexus\\V1beta1\342\002 Axelar\\Nexus\\V1beta1\\GPBMetadata\352\002\026Axelar::Nexus::V1beta1\310\341\036\000'
  _PARAMS.fields_by_name['chain_activation_threshold']._options = None
  _PARAMS.fields_by_name['chain_activation_threshold']._serialized_options = b'\310\336\037\000'
  _PARAMS.fields_by_name['chain_maintainer_missing_vote_threshold']._options = None
  _PARAMS.fields_by_name['chain_maintainer_missing_vote_threshold']._serialized_options = b'\310\336\037\000'
  _PARAMS.fields_by_name['chain_maintainer_incorrect_vote_threshold']._options = None
  _PARAMS.fields_by_name['chain_maintainer_incorrect_vote_threshold']._serialized_options = b'\310\336\037\000'
  _globals['_PARAMS']._serialized_start=120
  _globals['_PARAMS']._serialized_end=550
# @@protoc_insertion_point(module_scope)
