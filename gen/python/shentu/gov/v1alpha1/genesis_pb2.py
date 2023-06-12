# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: shentu/gov/v1alpha1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.gov.v1beta1 import gov_pb2 as cosmos_dot_gov_dot_v1beta1_dot_gov__pb2
from shentu.gov.v1alpha1 import gov_pb2 as shentu_dot_gov_dot_v1alpha1_dot_gov__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!shentu/gov/v1alpha1/genesis.proto\x12\x13shentu.gov.v1alpha1\x1a\x14gogoproto/gogo.proto\x1a\x1c\x63osmos/gov/v1beta1/gov.proto\x1a\x1dshentu/gov/v1alpha1/gov.proto\"\x88\x06\n\x0cGenesisState\x12Q\n\x14starting_proposal_id\x18\x01 \x01(\x04\x42\x1f\xf2\xde\x1f\x1byaml:\"starting_proposal_id\"R\x12startingProposalId\x12=\n\x08\x64\x65posits\x18\x02 \x03(\x0b\x32\x1b.cosmos.gov.v1beta1.DepositB\x04\xc8\xde\x1f\x00R\x08\x64\x65posits\x12\x34\n\x05votes\x18\x03 \x03(\x0b\x32\x18.cosmos.gov.v1beta1.VoteB\x04\xc8\xde\x1f\x00R\x05votes\x12@\n\tproposals\x18\x04 \x03(\x0b\x32\x1c.cosmos.gov.v1beta1.ProposalB\x04\xc8\xde\x1f\x00R\tproposals\x12g\n\x0e\x64\x65posit_params\x18\x05 \x01(\x0b\x32!.cosmos.gov.v1beta1.DepositParamsB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x15yaml:\"deposit_params\"R\rdepositParams\x12\x63\n\rvoting_params\x18\x06 \x01(\x0b\x32 .cosmos.gov.v1beta1.VotingParamsB\x1c\xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"voting_params\"R\x0cvotingParams\x12_\n\x0ctally_params\x18\x07 \x01(\x0b\x32\x1f.cosmos.gov.v1beta1.TallyParamsB\x1b\xc8\xde\x1f\x00\xf2\xde\x1f\x13yaml:\"tally_params\"R\x0btallyParams\x12\x64\n\rcustom_params\x18\x08 \x01(\x0b\x32!.shentu.gov.v1alpha1.CustomParamsB\x1c\xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"custom_params\"R\x0c\x63ustomParams\x12Y\n\x17\x63\x65rt_voted_proposal_ids\x18\t \x03(\x04\x42\"\xf2\xde\x1f\x1eyaml:\"cert_voted_proposal_ids\"R\x14\x63\x65rtVotedProposalIdsB\xc5\x01\n\x17\x63om.shentu.gov.v1alpha1B\x0cGenesisProtoP\x01Z.github.com/shentufoundation/shentu/x/gov/types\xa2\x02\x03SGX\xaa\x02\x13Shentu.Gov.V1alpha1\xca\x02\x13Shentu\\Gov\\V1alpha1\xe2\x02\x1fShentu\\Gov\\V1alpha1\\GPBMetadata\xea\x02\x15Shentu::Gov::V1alpha1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'shentu.gov.v1alpha1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.shentu.gov.v1alpha1B\014GenesisProtoP\001Z.github.com/shentufoundation/shentu/x/gov/types\242\002\003SGX\252\002\023Shentu.Gov.V1alpha1\312\002\023Shentu\\Gov\\V1alpha1\342\002\037Shentu\\Gov\\V1alpha1\\GPBMetadata\352\002\025Shentu::Gov::V1alpha1'
  _GENESISSTATE.fields_by_name['starting_proposal_id']._options = None
  _GENESISSTATE.fields_by_name['starting_proposal_id']._serialized_options = b'\362\336\037\033yaml:\"starting_proposal_id\"'
  _GENESISSTATE.fields_by_name['deposits']._options = None
  _GENESISSTATE.fields_by_name['deposits']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['votes']._options = None
  _GENESISSTATE.fields_by_name['votes']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['proposals']._options = None
  _GENESISSTATE.fields_by_name['proposals']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['deposit_params']._options = None
  _GENESISSTATE.fields_by_name['deposit_params']._serialized_options = b'\310\336\037\000\362\336\037\025yaml:\"deposit_params\"'
  _GENESISSTATE.fields_by_name['voting_params']._options = None
  _GENESISSTATE.fields_by_name['voting_params']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"voting_params\"'
  _GENESISSTATE.fields_by_name['tally_params']._options = None
  _GENESISSTATE.fields_by_name['tally_params']._serialized_options = b'\310\336\037\000\362\336\037\023yaml:\"tally_params\"'
  _GENESISSTATE.fields_by_name['custom_params']._options = None
  _GENESISSTATE.fields_by_name['custom_params']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"custom_params\"'
  _GENESISSTATE.fields_by_name['cert_voted_proposal_ids']._options = None
  _GENESISSTATE.fields_by_name['cert_voted_proposal_ids']._serialized_options = b'\362\336\037\036yaml:\"cert_voted_proposal_ids\"'
  _globals['_GENESISSTATE']._serialized_start=142
  _globals['_GENESISSTATE']._serialized_end=918
# @@protoc_insertion_point(module_scope)
