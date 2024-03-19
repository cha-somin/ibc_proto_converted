# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/gov/v1/genesis.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.gov.v1 import gov_pb2 as cosmos_dot_gov_dot_v1_dot_gov__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1b\x63osmos/gov/v1/genesis.proto\x12\rcosmos.gov.v1\x1a\x17\x63osmos/gov/v1/gov.proto\"\xd7\x03\n\x0cGenesisState\x12\x30\n\x14starting_proposal_id\x18\x01 \x01(\x04R\x12startingProposalId\x12\x32\n\x08\x64\x65posits\x18\x02 \x03(\x0b\x32\x16.cosmos.gov.v1.DepositR\x08\x64\x65posits\x12)\n\x05votes\x18\x03 \x03(\x0b\x32\x13.cosmos.gov.v1.VoteR\x05votes\x12\x35\n\tproposals\x18\x04 \x03(\x0b\x32\x17.cosmos.gov.v1.ProposalR\tproposals\x12G\n\x0e\x64\x65posit_params\x18\x05 \x01(\x0b\x32\x1c.cosmos.gov.v1.DepositParamsB\x02\x18\x01R\rdepositParams\x12\x44\n\rvoting_params\x18\x06 \x01(\x0b\x32\x1b.cosmos.gov.v1.VotingParamsB\x02\x18\x01R\x0cvotingParams\x12\x41\n\x0ctally_params\x18\x07 \x01(\x0b\x32\x1a.cosmos.gov.v1.TallyParamsB\x02\x18\x01R\x0btallyParams\x12-\n\x06params\x18\x08 \x01(\x0b\x32\x15.cosmos.gov.v1.ParamsR\x06paramsB\xa2\x01\n\x11\x63om.cosmos.gov.v1B\x0cGenesisProtoZ+github.com/cosmos/cosmos-sdk/x/gov/types/v1\xa2\x02\x03\x43GX\xaa\x02\rCosmos.Gov.V1\xca\x02\rCosmos\\Gov\\V1\xe2\x02\x19\x43osmos\\Gov\\V1\\GPBMetadata\xea\x02\x0f\x43osmos::Gov::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.gov.v1.genesis_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\021com.cosmos.gov.v1B\014GenesisProtoZ+github.com/cosmos/cosmos-sdk/x/gov/types/v1\242\002\003CGX\252\002\rCosmos.Gov.V1\312\002\rCosmos\\Gov\\V1\342\002\031Cosmos\\Gov\\V1\\GPBMetadata\352\002\017Cosmos::Gov::V1'
  _globals['_GENESISSTATE'].fields_by_name['deposit_params']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['deposit_params']._serialized_options = b'\030\001'
  _globals['_GENESISSTATE'].fields_by_name['voting_params']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['voting_params']._serialized_options = b'\030\001'
  _globals['_GENESISSTATE'].fields_by_name['tally_params']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['tally_params']._serialized_options = b'\030\001'
  _globals['_GENESISSTATE']._serialized_start=72
  _globals['_GENESISSTATE']._serialized_end=543
# @@protoc_insertion_point(module_scope)
