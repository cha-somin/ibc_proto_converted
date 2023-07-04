# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: injective/peggy/v1/events.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from injective.peggy.v1 import attestation_pb2 as injective_dot_peggy_dot_v1_dot_attestation__pb2
from injective.peggy.v1 import types_pb2 as injective_dot_peggy_dot_v1_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1finjective/peggy/v1/events.proto\x12\x12injective.peggy.v1\x1a\x14gogoproto/gogo.proto\x1a$injective/peggy/v1/attestation.proto\x1a\x1einjective/peggy/v1/types.proto\"\xf2\x01\n\x18\x45ventAttestationObserved\x12H\n\x10\x61ttestation_type\x18\x01 \x01(\x0e\x32\x1d.injective.peggy.v1.ClaimTypeR\x0f\x61ttestationType\x12\'\n\x0f\x62ridge_contract\x18\x02 \x01(\tR\x0e\x62ridgeContract\x12&\n\x0f\x62ridge_chain_id\x18\x03 \x01(\x04R\rbridgeChainId\x12%\n\x0e\x61ttestation_id\x18\x04 \x01(\x0cR\rattestationId\x12\x14\n\x05nonce\x18\x05 \x01(\x04R\x05nonce\"n\n\x1b\x45ventBridgeWithdrawCanceled\x12\'\n\x0f\x62ridge_contract\x18\x01 \x01(\tR\x0e\x62ridgeContract\x12&\n\x0f\x62ridge_chain_id\x18\x02 \x01(\x04R\rbridgeChainId\"\xc5\x01\n\x12\x45ventOutgoingBatch\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x31\n\x14orchestrator_address\x18\x02 \x01(\tR\x13orchestratorAddress\x12\x1f\n\x0b\x62\x61tch_nonce\x18\x03 \x01(\x04R\nbatchNonce\x12#\n\rbatch_timeout\x18\x04 \x01(\x04R\x0c\x62\x61tchTimeout\x12 \n\x0c\x62\x61tch_tx_ids\x18\x05 \x03(\x04R\nbatchTxIds\"\x9e\x01\n\x1a\x45ventOutgoingBatchCanceled\x12\'\n\x0f\x62ridge_contract\x18\x01 \x01(\tR\x0e\x62ridgeContract\x12&\n\x0f\x62ridge_chain_id\x18\x02 \x01(\x04R\rbridgeChainId\x12\x19\n\x08\x62\x61tch_id\x18\x03 \x01(\x04R\x07\x62\x61tchId\x12\x14\n\x05nonce\x18\x04 \x01(\x04R\x05nonce\"\xa6\x02\n\x18\x45ventValsetUpdateRequest\x12!\n\x0cvalset_nonce\x18\x01 \x01(\x04R\x0bvalsetNonce\x12#\n\rvalset_height\x18\x02 \x01(\x04R\x0cvalsetHeight\x12J\n\x0evalset_members\x18\x03 \x03(\x0b\x32#.injective.peggy.v1.BridgeValidatorR\rvalsetMembers\x12S\n\rreward_amount\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0crewardAmount\x12!\n\x0creward_token\x18\x05 \x01(\tR\x0brewardToken\"\xb1\x01\n\x1d\x45ventSetOrchestratorAddresses\x12+\n\x11validator_address\x18\x01 \x01(\tR\x10validatorAddress\x12\x31\n\x14orchestrator_address\x18\x02 \x01(\tR\x13orchestratorAddress\x12\x30\n\x14operator_eth_address\x18\x03 \x01(\tR\x12operatorEthAddress\"j\n\x12\x45ventValsetConfirm\x12!\n\x0cvalset_nonce\x18\x01 \x01(\x04R\x0bvalsetNonce\x12\x31\n\x14orchestrator_address\x18\x02 \x01(\tR\x13orchestratorAddress\"\x83\x02\n\x0e\x45ventSendToEth\x12$\n\x0eoutgoing_tx_id\x18\x01 \x01(\x04R\x0coutgoingTxId\x12\x16\n\x06sender\x18\x02 \x01(\tR\x06sender\x12\x1a\n\x08receiver\x18\x03 \x01(\tR\x08receiver\x12G\n\x06\x61mount\x18\x04 \x01(\tB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61mount\x12N\n\nbridge_fee\x18\x05 \x01(\tB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\tbridgeFee\"g\n\x11\x45ventConfirmBatch\x12\x1f\n\x0b\x62\x61tch_nonce\x18\x01 \x01(\x04R\nbatchNonce\x12\x31\n\x14orchestrator_address\x18\x02 \x01(\tR\x13orchestratorAddress\"t\n\x14\x45ventAttestationVote\x12\x1f\n\x0b\x65vent_nonce\x18\x01 \x01(\x04R\neventNonce\x12%\n\x0e\x61ttestation_id\x18\x02 \x01(\x0cR\rattestationId\x12\x14\n\x05voter\x18\x03 \x01(\tR\x05voter\"\x86\x03\n\x11\x45ventDepositClaim\x12\x1f\n\x0b\x65vent_nonce\x18\x01 \x01(\x04R\neventNonce\x12!\n\x0c\x65vent_height\x18\x02 \x01(\x04R\x0b\x65ventHeight\x12%\n\x0e\x61ttestation_id\x18\x03 \x01(\x0cR\rattestationId\x12\'\n\x0f\x65thereum_sender\x18\x04 \x01(\tR\x0e\x65thereumSender\x12\'\n\x0f\x63osmos_receiver\x18\x05 \x01(\tR\x0e\x63osmosReceiver\x12%\n\x0etoken_contract\x18\x06 \x01(\tR\rtokenContract\x12\x46\n\x06\x61mount\x18\x07 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06\x61mount\x12\x31\n\x14orchestrator_address\x18\x08 \x01(\tR\x13orchestratorAddress\x12\x12\n\x04\x64\x61ta\x18\t \x01(\tR\x04\x64\x61ta\"\xfa\x01\n\x12\x45ventWithdrawClaim\x12\x1f\n\x0b\x65vent_nonce\x18\x01 \x01(\x04R\neventNonce\x12!\n\x0c\x65vent_height\x18\x02 \x01(\x04R\x0b\x65ventHeight\x12%\n\x0e\x61ttestation_id\x18\x03 \x01(\x0cR\rattestationId\x12\x1f\n\x0b\x62\x61tch_nonce\x18\x04 \x01(\x04R\nbatchNonce\x12%\n\x0etoken_contract\x18\x05 \x01(\tR\rtokenContract\x12\x31\n\x14orchestrator_address\x18\x06 \x01(\tR\x13orchestratorAddress\"\xc9\x02\n\x17\x45ventERC20DeployedClaim\x12\x1f\n\x0b\x65vent_nonce\x18\x01 \x01(\x04R\neventNonce\x12!\n\x0c\x65vent_height\x18\x02 \x01(\x04R\x0b\x65ventHeight\x12%\n\x0e\x61ttestation_id\x18\x03 \x01(\x0cR\rattestationId\x12!\n\x0c\x63osmos_denom\x18\x04 \x01(\tR\x0b\x63osmosDenom\x12%\n\x0etoken_contract\x18\x05 \x01(\tR\rtokenContract\x12\x12\n\x04name\x18\x06 \x01(\tR\x04name\x12\x16\n\x06symbol\x18\x07 \x01(\tR\x06symbol\x12\x1a\n\x08\x64\x65\x63imals\x18\x08 \x01(\x04R\x08\x64\x65\x63imals\x12\x31\n\x14orchestrator_address\x18\t \x01(\tR\x13orchestratorAddress\"\x9d\x03\n\x16\x45ventValsetUpdateClaim\x12\x1f\n\x0b\x65vent_nonce\x18\x01 \x01(\x04R\neventNonce\x12!\n\x0c\x65vent_height\x18\x02 \x01(\x04R\x0b\x65ventHeight\x12%\n\x0e\x61ttestation_id\x18\x03 \x01(\x0cR\rattestationId\x12!\n\x0cvalset_nonce\x18\x04 \x01(\x04R\x0bvalsetNonce\x12J\n\x0evalset_members\x18\x05 \x03(\x0b\x32#.injective.peggy.v1.BridgeValidatorR\rvalsetMembers\x12S\n\rreward_amount\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0crewardAmount\x12!\n\x0creward_token\x18\x07 \x01(\tR\x0brewardToken\x12\x31\n\x14orchestrator_address\x18\x08 \x01(\tR\x13orchestratorAddress\"<\n\x14\x45ventCancelSendToEth\x12$\n\x0eoutgoing_tx_id\x18\x01 \x01(\x04R\x0coutgoingTxId\"\x88\x01\n\x1f\x45ventSubmitBadSignatureEvidence\x12*\n\x11\x62\x61\x64_eth_signature\x18\x01 \x01(\tR\x0f\x62\x61\x64\x45thSignature\x12\x39\n\x19\x62\x61\x64_eth_signature_subject\x18\x02 \x01(\tR\x16\x62\x61\x64\x45thSignatureSubject\"\xb5\x01\n\x13\x45ventValidatorSlash\x12\x14\n\x05power\x18\x01 \x01(\x03R\x05power\x12\x16\n\x06reason\x18\x02 \x01(\tR\x06reason\x12+\n\x11\x63onsensus_address\x18\x03 \x01(\tR\x10\x63onsensusAddress\x12)\n\x10operator_address\x18\x04 \x01(\tR\x0foperatorAddress\x12\x18\n\x07moniker\x18\x05 \x01(\tR\x07monikerB\xdc\x01\n\x16\x63om.injective.peggy.v1B\x0b\x45ventsProtoP\x01ZKgithub.com/InjectiveLabs/injective-core/injective-chain/modules/peggy/types\xa2\x02\x03IPX\xaa\x02\x12Injective.Peggy.V1\xca\x02\x12Injective\\Peggy\\V1\xe2\x02\x1eInjective\\Peggy\\V1\\GPBMetadata\xea\x02\x14Injective::Peggy::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'injective.peggy.v1.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.injective.peggy.v1B\013EventsProtoP\001ZKgithub.com/InjectiveLabs/injective-core/injective-chain/modules/peggy/types\242\002\003IPX\252\002\022Injective.Peggy.V1\312\002\022Injective\\Peggy\\V1\342\002\036Injective\\Peggy\\V1\\GPBMetadata\352\002\024Injective::Peggy::V1'
  _EVENTVALSETUPDATEREQUEST.fields_by_name['reward_amount']._options = None
  _EVENTVALSETUPDATEREQUEST.fields_by_name['reward_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _EVENTSENDTOETH.fields_by_name['amount']._options = None
  _EVENTSENDTOETH.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _EVENTSENDTOETH.fields_by_name['bridge_fee']._options = None
  _EVENTSENDTOETH.fields_by_name['bridge_fee']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _EVENTDEPOSITCLAIM.fields_by_name['amount']._options = None
  _EVENTDEPOSITCLAIM.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _EVENTVALSETUPDATECLAIM.fields_by_name['reward_amount']._options = None
  _EVENTVALSETUPDATECLAIM.fields_by_name['reward_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_EVENTATTESTATIONOBSERVED']._serialized_start=148
  _globals['_EVENTATTESTATIONOBSERVED']._serialized_end=390
  _globals['_EVENTBRIDGEWITHDRAWCANCELED']._serialized_start=392
  _globals['_EVENTBRIDGEWITHDRAWCANCELED']._serialized_end=502
  _globals['_EVENTOUTGOINGBATCH']._serialized_start=505
  _globals['_EVENTOUTGOINGBATCH']._serialized_end=702
  _globals['_EVENTOUTGOINGBATCHCANCELED']._serialized_start=705
  _globals['_EVENTOUTGOINGBATCHCANCELED']._serialized_end=863
  _globals['_EVENTVALSETUPDATEREQUEST']._serialized_start=866
  _globals['_EVENTVALSETUPDATEREQUEST']._serialized_end=1160
  _globals['_EVENTSETORCHESTRATORADDRESSES']._serialized_start=1163
  _globals['_EVENTSETORCHESTRATORADDRESSES']._serialized_end=1340
  _globals['_EVENTVALSETCONFIRM']._serialized_start=1342
  _globals['_EVENTVALSETCONFIRM']._serialized_end=1448
  _globals['_EVENTSENDTOETH']._serialized_start=1451
  _globals['_EVENTSENDTOETH']._serialized_end=1710
  _globals['_EVENTCONFIRMBATCH']._serialized_start=1712
  _globals['_EVENTCONFIRMBATCH']._serialized_end=1815
  _globals['_EVENTATTESTATIONVOTE']._serialized_start=1817
  _globals['_EVENTATTESTATIONVOTE']._serialized_end=1933
  _globals['_EVENTDEPOSITCLAIM']._serialized_start=1936
  _globals['_EVENTDEPOSITCLAIM']._serialized_end=2326
  _globals['_EVENTWITHDRAWCLAIM']._serialized_start=2329
  _globals['_EVENTWITHDRAWCLAIM']._serialized_end=2579
  _globals['_EVENTERC20DEPLOYEDCLAIM']._serialized_start=2582
  _globals['_EVENTERC20DEPLOYEDCLAIM']._serialized_end=2911
  _globals['_EVENTVALSETUPDATECLAIM']._serialized_start=2914
  _globals['_EVENTVALSETUPDATECLAIM']._serialized_end=3327
  _globals['_EVENTCANCELSENDTOETH']._serialized_start=3329
  _globals['_EVENTCANCELSENDTOETH']._serialized_end=3389
  _globals['_EVENTSUBMITBADSIGNATUREEVIDENCE']._serialized_start=3392
  _globals['_EVENTSUBMITBADSIGNATUREEVIDENCE']._serialized_end=3528
  _globals['_EVENTVALIDATORSLASH']._serialized_start=3531
  _globals['_EVENTVALIDATORSLASH']._serialized_end=3712
# @@protoc_insertion_point(module_scope)