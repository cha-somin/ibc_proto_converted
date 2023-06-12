# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: panacea/oracle/v2alpha2/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from panacea.oracle.v2alpha2 import oracle_pb2 as panacea_dot_oracle_dot_v2alpha2_dot_oracle__pb2
from panacea.oracle.v2alpha2 import genesis_pb2 as panacea_dot_oracle_dot_v2alpha2_dot_genesis__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n panacea/oracle/v2alpha2/tx.proto\x12\x17panacea.oracle.v2alpha2\x1a$panacea/oracle/v2alpha2/oracle.proto\x1a%panacea/oracle/v2alpha2/genesis.proto\x1a\x14gogoproto/gogo.proto\"\xab\x02\n\x11MsgRegisterOracle\x12\x1b\n\tunique_id\x18\x01 \x01(\tR\x08uniqueId\x12%\n\x0eoracle_address\x18\x02 \x01(\tR\roracleAddress\x12 \n\x0cnode_pub_key\x18\x03 \x01(\x0cR\nnodePubKey\x12:\n\x1anode_pub_key_remote_report\x18\x04 \x01(\x0cR\x16nodePubKeyRemoteReport\x12\x30\n\x14trusted_block_height\x18\x05 \x01(\x03R\x12trustedBlockHeight\x12,\n\x12trusted_block_hash\x18\x06 \x01(\x0cR\x10trustedBlockHash\x12\x14\n\x05nonce\x18\x07 \x01(\x0cR\x05nonce\"\x1b\n\x19MsgRegisterOracleResponse\"\xa4\x01\n\x19MsgVoteOracleRegistration\x12i\n\x18oracle_registration_vote\x18\x01 \x01(\x0b\x32/.panacea.oracle.v2alpha2.OracleRegistrationVoteR\x16oracleRegistrationVote\x12\x1c\n\tsignature\x18\x02 \x01(\x0cR\tsignature\"#\n!MsgVoteOracleRegistrationResponse\"\xaa\x02\n\x10MsgUpgradeOracle\x12\x1b\n\tunique_id\x18\x01 \x01(\tR\x08uniqueId\x12%\n\x0eoracle_address\x18\x02 \x01(\tR\roracleAddress\x12 \n\x0cnode_pub_key\x18\x03 \x01(\x0cR\nnodePubKey\x12:\n\x1anode_pub_key_remote_report\x18\x04 \x01(\x0cR\x16nodePubKeyRemoteReport\x12\x30\n\x14trusted_block_height\x18\x05 \x01(\x03R\x12trustedBlockHeight\x12,\n\x12trusted_block_hash\x18\x06 \x01(\x0cR\x10trustedBlockHash\x12\x14\n\x05nonce\x18\x07 \x01(\x0cR\x05nonce\"\x1a\n\x18MsgUpgradeOracleResponse2\xf1\x02\n\x03Msg\x12p\n\x0eRegisterOracle\x12*.panacea.oracle.v2alpha2.MsgRegisterOracle\x1a\x32.panacea.oracle.v2alpha2.MsgRegisterOracleResponse\x12\x88\x01\n\x16VoteOracleRegistration\x12\x32.panacea.oracle.v2alpha2.MsgVoteOracleRegistration\x1a:.panacea.oracle.v2alpha2.MsgVoteOracleRegistrationResponse\x12m\n\rUpgradeOracle\x12).panacea.oracle.v2alpha2.MsgUpgradeOracle\x1a\x31.panacea.oracle.v2alpha2.MsgUpgradeOracleResponseB\xd8\x01\n\x1b\x63om.panacea.oracle.v2alpha2B\x07TxProtoP\x01Z2github.com/medibloc/panacea-core/v2/x/oracle/types\xa2\x02\x03POX\xaa\x02\x17Panacea.Oracle.V2alpha2\xca\x02\x17Panacea\\Oracle\\V2alpha2\xe2\x02#Panacea\\Oracle\\V2alpha2\\GPBMetadata\xea\x02\x19Panacea::Oracle::V2alpha2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'panacea.oracle.v2alpha2.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.panacea.oracle.v2alpha2B\007TxProtoP\001Z2github.com/medibloc/panacea-core/v2/x/oracle/types\242\002\003POX\252\002\027Panacea.Oracle.V2alpha2\312\002\027Panacea\\Oracle\\V2alpha2\342\002#Panacea\\Oracle\\V2alpha2\\GPBMetadata\352\002\031Panacea::Oracle::V2alpha2'
  _globals['_MSGREGISTERORACLE']._serialized_start=161
  _globals['_MSGREGISTERORACLE']._serialized_end=460
  _globals['_MSGREGISTERORACLERESPONSE']._serialized_start=462
  _globals['_MSGREGISTERORACLERESPONSE']._serialized_end=489
  _globals['_MSGVOTEORACLEREGISTRATION']._serialized_start=492
  _globals['_MSGVOTEORACLEREGISTRATION']._serialized_end=656
  _globals['_MSGVOTEORACLEREGISTRATIONRESPONSE']._serialized_start=658
  _globals['_MSGVOTEORACLEREGISTRATIONRESPONSE']._serialized_end=693
  _globals['_MSGUPGRADEORACLE']._serialized_start=696
  _globals['_MSGUPGRADEORACLE']._serialized_end=994
  _globals['_MSGUPGRADEORACLERESPONSE']._serialized_start=996
  _globals['_MSGUPGRADEORACLERESPONSE']._serialized_end=1022
  _globals['_MSG']._serialized_start=1025
  _globals['_MSG']._serialized_end=1394
# @@protoc_insertion_point(module_scope)
