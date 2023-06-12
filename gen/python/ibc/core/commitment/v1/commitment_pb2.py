# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ibc/core/commitment/v1/commitment.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.ics23.v1 import proofs_pb2 as cosmos_dot_ics23_dot_v1_dot_proofs__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'ibc/core/commitment/v1/commitment.proto\x12\x16ibc.core.commitment.v1\x1a\x14gogoproto/gogo.proto\x1a\x1c\x63osmos/ics23/v1/proofs.proto\"&\n\nMerkleRoot\x12\x12\n\x04hash\x18\x01 \x01(\x0cR\x04hash:\x04\x88\xa0\x1f\x00\"-\n\x0cMerklePrefix\x12\x1d\n\nkey_prefix\x18\x01 \x01(\x0cR\tkeyPrefix\"-\n\nMerklePath\x12\x19\n\x08key_path\x18\x01 \x03(\tR\x07keyPath:\x04\x98\xa0\x1f\x00\"G\n\x0bMerkleProof\x12\x38\n\x06proofs\x18\x01 \x03(\x0b\x32 .cosmos.ics23.v1.CommitmentProofR\x06proofsB\xe6\x01\n\x1a\x63om.ibc.core.commitment.v1B\x0f\x43ommitmentProtoP\x01Z<github.com/cosmos/ibc-go/v7/modules/core/23-commitment/types\xa2\x02\x03ICC\xaa\x02\x16Ibc.Core.Commitment.V1\xca\x02\x16Ibc\\Core\\Commitment\\V1\xe2\x02\"Ibc\\Core\\Commitment\\V1\\GPBMetadata\xea\x02\x19Ibc::Core::Commitment::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ibc.core.commitment.v1.commitment_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.ibc.core.commitment.v1B\017CommitmentProtoP\001Z<github.com/cosmos/ibc-go/v7/modules/core/23-commitment/types\242\002\003ICC\252\002\026Ibc.Core.Commitment.V1\312\002\026Ibc\\Core\\Commitment\\V1\342\002\"Ibc\\Core\\Commitment\\V1\\GPBMetadata\352\002\031Ibc::Core::Commitment::V1'
  _MERKLEROOT._options = None
  _MERKLEROOT._serialized_options = b'\210\240\037\000'
  _MERKLEPATH._options = None
  _MERKLEPATH._serialized_options = b'\230\240\037\000'
  _globals['_MERKLEROOT']._serialized_start=119
  _globals['_MERKLEROOT']._serialized_end=157
  _globals['_MERKLEPREFIX']._serialized_start=159
  _globals['_MERKLEPREFIX']._serialized_end=204
  _globals['_MERKLEPATH']._serialized_start=206
  _globals['_MERKLEPATH']._serialized_end=251
  _globals['_MERKLEPROOF']._serialized_start=253
  _globals['_MERKLEPROOF']._serialized_end=324
# @@protoc_insertion_point(module_scope)
