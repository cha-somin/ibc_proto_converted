# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gravity/v1/batch.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from gravity.v1 import attestation_pb2 as gravity_dot_v1_dot_attestation__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16gravity/v1/batch.proto\x12\ngravity.v1\x1a\x14gogoproto/gogo.proto\x1a\x1cgravity/v1/attestation.proto\"\xfa\x01\n\x0fOutgoingTxBatch\x12\x1f\n\x0b\x62\x61tch_nonce\x18\x01 \x01(\x04R\nbatchNonce\x12#\n\rbatch_timeout\x18\x02 \x01(\x04R\x0c\x62\x61tchTimeout\x12H\n\x0ctransactions\x18\x03 \x03(\x0b\x32\x1e.gravity.v1.OutgoingTransferTxB\x04\xc8\xde\x1f\x00R\x0ctransactions\x12%\n\x0etoken_contract\x18\x04 \x01(\tR\rtokenContract\x12\x30\n\x14\x63osmos_block_created\x18\x05 \x01(\x04R\x12\x63osmosBlockCreated\"\xd9\x01\n\x12OutgoingTransferTx\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x16\n\x06sender\x18\x02 \x01(\tR\x06sender\x12!\n\x0c\x64\x65st_address\x18\x03 \x01(\tR\x0b\x64\x65stAddress\x12=\n\x0b\x65rc20_token\x18\x04 \x01(\x0b\x32\x16.gravity.v1.ERC20TokenB\x04\xc8\xde\x1f\x00R\nerc20Token\x12\x39\n\terc20_fee\x18\x05 \x01(\x0b\x32\x16.gravity.v1.ERC20TokenB\x04\xc8\xde\x1f\x00R\x08\x65rc20Fee\"\xf5\x02\n\x11OutgoingLogicCall\x12:\n\ttransfers\x18\x01 \x03(\x0b\x32\x16.gravity.v1.ERC20TokenB\x04\xc8\xde\x1f\x00R\ttransfers\x12\x30\n\x04\x66\x65\x65s\x18\x02 \x03(\x0b\x32\x16.gravity.v1.ERC20TokenB\x04\xc8\xde\x1f\x00R\x04\x66\x65\x65s\x12\x34\n\x16logic_contract_address\x18\x03 \x01(\tR\x14logicContractAddress\x12\x18\n\x07payload\x18\x04 \x01(\x0cR\x07payload\x12\x18\n\x07timeout\x18\x05 \x01(\x04R\x07timeout\x12\'\n\x0finvalidation_id\x18\x06 \x01(\x0cR\x0einvalidationId\x12-\n\x12invalidation_nonce\x18\x07 \x01(\x04R\x11invalidationNonce\x12\x30\n\x14\x63osmos_block_created\x18\x08 \x01(\x04R\x12\x63osmosBlockCreated\"\x9e\x01\n\x1a\x45ventOutgoingBatchCanceled\x12\'\n\x0f\x62ridge_contract\x18\x01 \x01(\tR\x0e\x62ridgeContract\x12&\n\x0f\x62ridge_chain_id\x18\x02 \x01(\tR\rbridgeChainId\x12\x19\n\x08\x62\x61tch_id\x18\x03 \x01(\tR\x07\x62\x61tchId\x12\x14\n\x05nonce\x18\x04 \x01(\tR\x05nonce\"\x96\x01\n\x12\x45ventOutgoingBatch\x12\'\n\x0f\x62ridge_contract\x18\x01 \x01(\tR\x0e\x62ridgeContract\x12&\n\x0f\x62ridge_chain_id\x18\x02 \x01(\tR\rbridgeChainId\x12\x19\n\x08\x62\x61tch_id\x18\x03 \x01(\tR\x07\x62\x61tchId\x12\x14\n\x05nonce\x18\x04 \x01(\tR\x05nonceB\xa6\x01\n\x0e\x63om.gravity.v1B\nBatchProtoP\x01Z?github.com/Gravity-Bridge/Gravity-Bridge/module/x/gravity/types\xa2\x02\x03GXX\xaa\x02\nGravity.V1\xca\x02\nGravity\\V1\xe2\x02\x16Gravity\\V1\\GPBMetadata\xea\x02\x0bGravity::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'gravity.v1.batch_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\016com.gravity.v1B\nBatchProtoP\001Z?github.com/Gravity-Bridge/Gravity-Bridge/module/x/gravity/types\242\002\003GXX\252\002\nGravity.V1\312\002\nGravity\\V1\342\002\026Gravity\\V1\\GPBMetadata\352\002\013Gravity::V1'
  _OUTGOINGTXBATCH.fields_by_name['transactions']._options = None
  _OUTGOINGTXBATCH.fields_by_name['transactions']._serialized_options = b'\310\336\037\000'
  _OUTGOINGTRANSFERTX.fields_by_name['erc20_token']._options = None
  _OUTGOINGTRANSFERTX.fields_by_name['erc20_token']._serialized_options = b'\310\336\037\000'
  _OUTGOINGTRANSFERTX.fields_by_name['erc20_fee']._options = None
  _OUTGOINGTRANSFERTX.fields_by_name['erc20_fee']._serialized_options = b'\310\336\037\000'
  _OUTGOINGLOGICCALL.fields_by_name['transfers']._options = None
  _OUTGOINGLOGICCALL.fields_by_name['transfers']._serialized_options = b'\310\336\037\000'
  _OUTGOINGLOGICCALL.fields_by_name['fees']._options = None
  _OUTGOINGLOGICCALL.fields_by_name['fees']._serialized_options = b'\310\336\037\000'
  _globals['_OUTGOINGTXBATCH']._serialized_start=91
  _globals['_OUTGOINGTXBATCH']._serialized_end=341
  _globals['_OUTGOINGTRANSFERTX']._serialized_start=344
  _globals['_OUTGOINGTRANSFERTX']._serialized_end=561
  _globals['_OUTGOINGLOGICCALL']._serialized_start=564
  _globals['_OUTGOINGLOGICCALL']._serialized_end=937
  _globals['_EVENTOUTGOINGBATCHCANCELED']._serialized_start=940
  _globals['_EVENTOUTGOINGBATCHCANCELED']._serialized_end=1098
  _globals['_EVENTOUTGOINGBATCH']._serialized_start=1101
  _globals['_EVENTOUTGOINGBATCH']._serialized_end=1251
# @@protoc_insertion_point(module_scope)
