# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cryptoorg/nft_transfer/v1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cryptoorg.nft_transfer.v1 import trace_pb2 as cryptoorg_dot_nft__transfer_dot_v1_dot_trace__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'cryptoorg/nft_transfer/v1/genesis.proto\x12\x19\x63hainmain.nft_transfer.v1\x1a%cryptoorg/nft_transfer/v1/trace.proto\x1a\x14gogoproto/gogo.proto\"v\n\x0cGenesisState\x12\x17\n\x07port_id\x18\x01 \x01(\tR\x06portId\x12M\n\x06traces\x18\x02 \x03(\x0b\x32%.chainmain.nft_transfer.v1.ClassTraceB\x0e\xc8\xde\x1f\x00\xaa\xdf\x1f\x06TracesR\x06tracesB\xec\x01\n\x1d\x63om.chainmain.nft_transfer.v1B\x0cGenesisProtoP\x01Z;github.com/crypto-org-chain/chain-main/x/nft-transfer/types\xa2\x02\x03\x43NX\xaa\x02\x18\x43hainmain.NftTransfer.V1\xca\x02\x18\x43hainmain\\NftTransfer\\V1\xe2\x02$Chainmain\\NftTransfer\\V1\\GPBMetadata\xea\x02\x1a\x43hainmain::NftTransfer::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cryptoorg.nft_transfer.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.chainmain.nft_transfer.v1B\014GenesisProtoP\001Z;github.com/crypto-org-chain/chain-main/x/nft-transfer/types\242\002\003CNX\252\002\030Chainmain.NftTransfer.V1\312\002\030Chainmain\\NftTransfer\\V1\342\002$Chainmain\\NftTransfer\\V1\\GPBMetadata\352\002\032Chainmain::NftTransfer::V1'
  _GENESISSTATE.fields_by_name['traces']._options = None
  _GENESISSTATE.fields_by_name['traces']._serialized_options = b'\310\336\037\000\252\337\037\006Traces'
  _globals['_GENESISSTATE']._serialized_start=131
  _globals['_GENESISSTATE']._serialized_end=249
# @@protoc_insertion_point(module_scope)
