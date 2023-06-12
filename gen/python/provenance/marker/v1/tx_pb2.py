# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: provenance/marker/v1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos.bank.v1beta1 import bank_pb2 as cosmos_dot_bank_dot_v1beta1_dot_bank__pb2
from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2
from ibc.applications.transfer.v1 import tx_pb2 as ibc_dot_applications_dot_transfer_dot_v1_dot_tx__pb2
from provenance.marker.v1 import marker_pb2 as provenance_dot_marker_dot_v1_dot_marker__pb2
from provenance.marker.v1 import accessgrant_pb2 as provenance_dot_marker_dot_v1_dot_accessgrant__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1dprovenance/marker/v1/tx.proto\x12\x14provenance.marker.v1\x1a\x19google/protobuf/any.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1e\x63osmos/bank/v1beta1/bank.proto\x1a\x17\x63osmos/msg/v1/msg.proto\x1a%ibc/applications/transfer/v1/tx.proto\x1a!provenance/marker/v1/marker.proto\x1a&provenance/marker/v1/accessgrant.proto\"\xb7\x01\n\x18MsgGrantAllowanceRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\x12\x18\n\x07grantee\x18\x03 \x01(\tR\x07grantee\x12\x45\n\tallowance\x18\x04 \x01(\x0b\x32\x14.google.protobuf.AnyB\x11\xca\xb4-\rFeeAllowanceIR\tallowance\"\x1b\n\x19MsgGrantAllowanceResponse\"\xd4\x04\n\x13MsgAddMarkerRequest\x12\x62\n\x06\x61mount\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61mount\x12\x18\n\x07manager\x18\x03 \x01(\tR\x07manager\x12!\n\x0c\x66rom_address\x18\x04 \x01(\tR\x0b\x66romAddress\x12:\n\x06status\x18\x05 \x01(\x0e\x32\".provenance.marker.v1.MarkerStatusR\x06status\x12\x41\n\x0bmarker_type\x18\x06 \x01(\x0e\x32 .provenance.marker.v1.MarkerTypeR\nmarkerType\x12H\n\x0b\x61\x63\x63\x65ss_list\x18\x07 \x03(\x0b\x32!.provenance.marker.v1.AccessGrantB\x04\xc8\xde\x1f\x00R\naccessList\x12!\n\x0csupply_fixed\x18\x08 \x01(\x08R\x0bsupplyFixed\x12\x38\n\x18\x61llow_governance_control\x18\t \x01(\x08R\x16\x61llowGovernanceControl\x12\x32\n\x15\x61llow_forced_transfer\x18\n \x01(\x08R\x13\x61llowForcedTransfer\x12/\n\x13required_attributes\x18\x0b \x03(\tR\x12requiredAttributes:\x11\x82\xe7\xb0*\x0c\x66rom_address\"\x16\n\x14MsgAddMarkerResponse\"\x92\x01\n\x13MsgAddAccessRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\x12?\n\x06\x61\x63\x63\x65ss\x18\x03 \x03(\x0b\x32!.provenance.marker.v1.AccessGrantB\x04\xc8\xde\x1f\x00R\x06\x61\x63\x63\x65ss\"\x16\n\x14MsgAddAccessResponse\"}\n\x16MsgDeleteAccessRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\x12\'\n\x0fremoved_address\x18\x03 \x01(\tR\x0eremovedAddress\"\x19\n\x17MsgDeleteAccessResponse\"P\n\x12MsgFinalizeRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\"\x15\n\x13MsgFinalizeResponse\"P\n\x12MsgActivateRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\"\x15\n\x13MsgActivateResponse\"N\n\x10MsgCancelRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\"\x13\n\x11MsgCancelResponse\"N\n\x10MsgDeleteRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\"\x13\n\x11MsgDeleteResponse\"\x9a\x01\n\x0eMsgMintRequest\x12\x62\n\x06\x61mount\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61mount\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\"\x11\n\x0fMsgMintResponse\"\x9a\x01\n\x0eMsgBurnRequest\x12\x62\n\x06\x61mount\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61mount\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\"\x11\n\x0fMsgBurnResponse\"\xd4\x01\n\x12MsgWithdrawRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\x12\x1d\n\nto_address\x18\x03 \x01(\tR\ttoAddress\x12\x63\n\x06\x61mount\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x61mount\"\x15\n\x13MsgWithdrawResponse\"\xe0\x01\n\x12MsgTransferRequest\x12\x62\n\x06\x61mount\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61mount\x12$\n\radministrator\x18\x03 \x01(\tR\radministrator\x12!\n\x0c\x66rom_address\x18\x04 \x01(\tR\x0b\x66romAddress\x12\x1d\n\nto_address\x18\x05 \x01(\tR\ttoAddress\"\x15\n\x13MsgTransferResponse\"\xd2\x01\n\x15MsgIbcTransferRequest\x12\x92\x01\n\x08transfer\x18\x01 \x01(\x0b\x32).ibc.applications.transfer.v1.MsgTransferBK\xc8\xde\x1f\x00\xda\xde\x1f\x43github.com/cosmos/ibc-go/v6/modules/apps/transfer/types.MsgTransferR\x08transfer\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\"\x18\n\x16MsgIbcTransferResponse\"\xb9\x01\n\x1aMsgSetDenomMetadataRequest\x12u\n\x08metadata\x18\x01 \x01(\x0b\x32\x1d.cosmos.bank.v1beta1.MetadataB:\xc8\xde\x1f\x00\xda\xde\x1f\x32github.com/cosmos/cosmos-sdk/x/bank/types.MetadataR\x08metadata\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\"\x1d\n\x1bMsgSetDenomMetadataResponse\"\x95\x04\n#MsgAddFinalizeActivateMarkerRequest\x12\x62\n\x06\x61mount\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61mount\x12\x18\n\x07manager\x18\x03 \x01(\tR\x07manager\x12!\n\x0c\x66rom_address\x18\x04 \x01(\tR\x0b\x66romAddress\x12\x41\n\x0bmarker_type\x18\x05 \x01(\x0e\x32 .provenance.marker.v1.MarkerTypeR\nmarkerType\x12H\n\x0b\x61\x63\x63\x65ss_list\x18\x06 \x03(\x0b\x32!.provenance.marker.v1.AccessGrantB\x04\xc8\xde\x1f\x00R\naccessList\x12!\n\x0csupply_fixed\x18\x07 \x01(\x08R\x0bsupplyFixed\x12\x38\n\x18\x61llow_governance_control\x18\x08 \x01(\x08R\x16\x61llowGovernanceControl\x12\x32\n\x15\x61llow_forced_transfer\x18\t \x01(\x08R\x13\x61llowForcedTransfer\x12/\n\x13required_attributes\x18\n \x03(\tR\x12requiredAttributes\"&\n$MsgAddFinalizeActivateMarkerResponse\"\xf9\x01\n MsgSupplyIncreaseProposalRequest\x12\x62\n\x06\x61mount\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61mount\x12%\n\x0etarget_address\x18\x02 \x01(\tR\rtargetAddress\x12\x36\n\tauthority\x18\x03 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tauthority:\x12\xe8\xa0\x1f\x01\x82\xe7\xb0*\tauthority\"#\n!MsgSupplyIncreaseProposalResponse\"\x96\x02\n\"MsgUpdateRequiredAttributesRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12<\n\x1aremove_required_attributes\x18\x02 \x03(\tR\x18removeRequiredAttributes\x12\x36\n\x17\x61\x64\x64_required_attributes\x18\x03 \x03(\tR\x15\x61\x64\x64RequiredAttributes\x12G\n\x12transfer_authority\x18\x04 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x11transferAuthority:\x1b\xe8\xa0\x1f\x01\x82\xe7\xb0*\x12transfer_authority\"%\n#MsgUpdateRequiredAttributesResponse\"\xb6\x01\n\x1eMsgUpdateForcedTransferRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x32\n\x15\x61llow_forced_transfer\x18\x02 \x01(\x08R\x13\x61llowForcedTransfer\x12\x36\n\tauthority\x18\x03 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tauthority:\x12\xe8\xa0\x1f\x01\x82\xe7\xb0*\tauthority\"!\n\x1fMsgUpdateForcedTransferResponse\"\x89\x01\n\x18MsgSetAccountDataRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x14\n\x05value\x18\x02 \x01(\tR\x05value\x12\x30\n\x06signer\x18\x03 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x06signer:\x0f\xe8\xa0\x1f\x01\x82\xe7\xb0*\x06signer\"\x1b\n\x19MsgSetAccountDataResponse2\xa0\x10\n\x03Msg\x12_\n\x08\x46inalize\x12(.provenance.marker.v1.MsgFinalizeRequest\x1a).provenance.marker.v1.MsgFinalizeResponse\x12_\n\x08\x41\x63tivate\x12(.provenance.marker.v1.MsgActivateRequest\x1a).provenance.marker.v1.MsgActivateResponse\x12Y\n\x06\x43\x61ncel\x12&.provenance.marker.v1.MsgCancelRequest\x1a\'.provenance.marker.v1.MsgCancelResponse\x12Y\n\x06\x44\x65lete\x12&.provenance.marker.v1.MsgDeleteRequest\x1a\'.provenance.marker.v1.MsgDeleteResponse\x12S\n\x04Mint\x12$.provenance.marker.v1.MsgMintRequest\x1a%.provenance.marker.v1.MsgMintResponse\x12S\n\x04\x42urn\x12$.provenance.marker.v1.MsgBurnRequest\x1a%.provenance.marker.v1.MsgBurnResponse\x12\x62\n\tAddAccess\x12).provenance.marker.v1.MsgAddAccessRequest\x1a*.provenance.marker.v1.MsgAddAccessResponse\x12k\n\x0c\x44\x65leteAccess\x12,.provenance.marker.v1.MsgDeleteAccessRequest\x1a-.provenance.marker.v1.MsgDeleteAccessResponse\x12_\n\x08Withdraw\x12(.provenance.marker.v1.MsgWithdrawRequest\x1a).provenance.marker.v1.MsgWithdrawResponse\x12\x62\n\tAddMarker\x12).provenance.marker.v1.MsgAddMarkerRequest\x1a*.provenance.marker.v1.MsgAddMarkerResponse\x12_\n\x08Transfer\x12(.provenance.marker.v1.MsgTransferRequest\x1a).provenance.marker.v1.MsgTransferResponse\x12h\n\x0bIbcTransfer\x12+.provenance.marker.v1.MsgIbcTransferRequest\x1a,.provenance.marker.v1.MsgIbcTransferResponse\x12w\n\x10SetDenomMetadata\x12\x30.provenance.marker.v1.MsgSetDenomMetadataRequest\x1a\x31.provenance.marker.v1.MsgSetDenomMetadataResponse\x12q\n\x0eGrantAllowance\x12..provenance.marker.v1.MsgGrantAllowanceRequest\x1a/.provenance.marker.v1.MsgGrantAllowanceResponse\x12\x92\x01\n\x19\x41\x64\x64\x46inalizeActivateMarker\x12\x39.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest\x1a:.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse\x12\x89\x01\n\x16SupplyIncreaseProposal\x12\x36.provenance.marker.v1.MsgSupplyIncreaseProposalRequest\x1a\x37.provenance.marker.v1.MsgSupplyIncreaseProposalResponse\x12\x8f\x01\n\x18UpdateRequiredAttributes\x12\x38.provenance.marker.v1.MsgUpdateRequiredAttributesRequest\x1a\x39.provenance.marker.v1.MsgUpdateRequiredAttributesResponse\x12\x83\x01\n\x14UpdateForcedTransfer\x12\x34.provenance.marker.v1.MsgUpdateForcedTransferRequest\x1a\x35.provenance.marker.v1.MsgUpdateForcedTransferResponse\x12q\n\x0eSetAccountData\x12..provenance.marker.v1.MsgSetAccountDataRequest\x1a/.provenance.marker.v1.MsgSetAccountDataResponseB\xc9\x01\n\x18\x63om.provenance.marker.v1B\x07TxProtoP\x01Z2github.com/provenance-io/provenance/x/marker/types\xa2\x02\x03PMX\xaa\x02\x14Provenance.Marker.V1\xca\x02\x14Provenance\\Marker\\V1\xe2\x02 Provenance\\Marker\\V1\\GPBMetadata\xea\x02\x16Provenance::Marker::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'provenance.marker.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.provenance.marker.v1B\007TxProtoP\001Z2github.com/provenance-io/provenance/x/marker/types\242\002\003PMX\252\002\024Provenance.Marker.V1\312\002\024Provenance\\Marker\\V1\342\002 Provenance\\Marker\\V1\\GPBMetadata\352\002\026Provenance::Marker::V1'
  _MSGGRANTALLOWANCEREQUEST.fields_by_name['allowance']._options = None
  _MSGGRANTALLOWANCEREQUEST.fields_by_name['allowance']._serialized_options = b'\312\264-\rFeeAllowanceI'
  _MSGADDMARKERREQUEST.fields_by_name['amount']._options = None
  _MSGADDMARKERREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGADDMARKERREQUEST.fields_by_name['access_list']._options = None
  _MSGADDMARKERREQUEST.fields_by_name['access_list']._serialized_options = b'\310\336\037\000'
  _MSGADDMARKERREQUEST._options = None
  _MSGADDMARKERREQUEST._serialized_options = b'\202\347\260*\014from_address'
  _MSGADDACCESSREQUEST.fields_by_name['access']._options = None
  _MSGADDACCESSREQUEST.fields_by_name['access']._serialized_options = b'\310\336\037\000'
  _MSGMINTREQUEST.fields_by_name['amount']._options = None
  _MSGMINTREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGBURNREQUEST.fields_by_name['amount']._options = None
  _MSGBURNREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGWITHDRAWREQUEST.fields_by_name['amount']._options = None
  _MSGWITHDRAWREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _MSGTRANSFERREQUEST.fields_by_name['amount']._options = None
  _MSGTRANSFERREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGIBCTRANSFERREQUEST.fields_by_name['transfer']._options = None
  _MSGIBCTRANSFERREQUEST.fields_by_name['transfer']._serialized_options = b'\310\336\037\000\332\336\037Cgithub.com/cosmos/ibc-go/v6/modules/apps/transfer/types.MsgTransfer'
  _MSGSETDENOMMETADATAREQUEST.fields_by_name['metadata']._options = None
  _MSGSETDENOMMETADATAREQUEST.fields_by_name['metadata']._serialized_options = b'\310\336\037\000\332\336\0372github.com/cosmos/cosmos-sdk/x/bank/types.Metadata'
  _MSGADDFINALIZEACTIVATEMARKERREQUEST.fields_by_name['amount']._options = None
  _MSGADDFINALIZEACTIVATEMARKERREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGADDFINALIZEACTIVATEMARKERREQUEST.fields_by_name['access_list']._options = None
  _MSGADDFINALIZEACTIVATEMARKERREQUEST.fields_by_name['access_list']._serialized_options = b'\310\336\037\000'
  _MSGSUPPLYINCREASEPROPOSALREQUEST.fields_by_name['amount']._options = None
  _MSGSUPPLYINCREASEPROPOSALREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGSUPPLYINCREASEPROPOSALREQUEST.fields_by_name['authority']._options = None
  _MSGSUPPLYINCREASEPROPOSALREQUEST.fields_by_name['authority']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGSUPPLYINCREASEPROPOSALREQUEST._options = None
  _MSGSUPPLYINCREASEPROPOSALREQUEST._serialized_options = b'\350\240\037\001\202\347\260*\tauthority'
  _MSGUPDATEREQUIREDATTRIBUTESREQUEST.fields_by_name['transfer_authority']._options = None
  _MSGUPDATEREQUIREDATTRIBUTESREQUEST.fields_by_name['transfer_authority']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGUPDATEREQUIREDATTRIBUTESREQUEST._options = None
  _MSGUPDATEREQUIREDATTRIBUTESREQUEST._serialized_options = b'\350\240\037\001\202\347\260*\022transfer_authority'
  _MSGUPDATEFORCEDTRANSFERREQUEST.fields_by_name['authority']._options = None
  _MSGUPDATEFORCEDTRANSFERREQUEST.fields_by_name['authority']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGUPDATEFORCEDTRANSFERREQUEST._options = None
  _MSGUPDATEFORCEDTRANSFERREQUEST._serialized_options = b'\350\240\037\001\202\347\260*\tauthority'
  _MSGSETACCOUNTDATAREQUEST.fields_by_name['signer']._options = None
  _MSGSETACCOUNTDATAREQUEST.fields_by_name['signer']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGSETACCOUNTDATAREQUEST._options = None
  _MSGSETACCOUNTDATAREQUEST._serialized_options = b'\350\240\037\001\202\347\260*\006signer'
  _globals['_MSGGRANTALLOWANCEREQUEST']._serialized_start=335
  _globals['_MSGGRANTALLOWANCEREQUEST']._serialized_end=518
  _globals['_MSGGRANTALLOWANCERESPONSE']._serialized_start=520
  _globals['_MSGGRANTALLOWANCERESPONSE']._serialized_end=547
  _globals['_MSGADDMARKERREQUEST']._serialized_start=550
  _globals['_MSGADDMARKERREQUEST']._serialized_end=1146
  _globals['_MSGADDMARKERRESPONSE']._serialized_start=1148
  _globals['_MSGADDMARKERRESPONSE']._serialized_end=1170
  _globals['_MSGADDACCESSREQUEST']._serialized_start=1173
  _globals['_MSGADDACCESSREQUEST']._serialized_end=1319
  _globals['_MSGADDACCESSRESPONSE']._serialized_start=1321
  _globals['_MSGADDACCESSRESPONSE']._serialized_end=1343
  _globals['_MSGDELETEACCESSREQUEST']._serialized_start=1345
  _globals['_MSGDELETEACCESSREQUEST']._serialized_end=1470
  _globals['_MSGDELETEACCESSRESPONSE']._serialized_start=1472
  _globals['_MSGDELETEACCESSRESPONSE']._serialized_end=1497
  _globals['_MSGFINALIZEREQUEST']._serialized_start=1499
  _globals['_MSGFINALIZEREQUEST']._serialized_end=1579
  _globals['_MSGFINALIZERESPONSE']._serialized_start=1581
  _globals['_MSGFINALIZERESPONSE']._serialized_end=1602
  _globals['_MSGACTIVATEREQUEST']._serialized_start=1604
  _globals['_MSGACTIVATEREQUEST']._serialized_end=1684
  _globals['_MSGACTIVATERESPONSE']._serialized_start=1686
  _globals['_MSGACTIVATERESPONSE']._serialized_end=1707
  _globals['_MSGCANCELREQUEST']._serialized_start=1709
  _globals['_MSGCANCELREQUEST']._serialized_end=1787
  _globals['_MSGCANCELRESPONSE']._serialized_start=1789
  _globals['_MSGCANCELRESPONSE']._serialized_end=1808
  _globals['_MSGDELETEREQUEST']._serialized_start=1810
  _globals['_MSGDELETEREQUEST']._serialized_end=1888
  _globals['_MSGDELETERESPONSE']._serialized_start=1890
  _globals['_MSGDELETERESPONSE']._serialized_end=1909
  _globals['_MSGMINTREQUEST']._serialized_start=1912
  _globals['_MSGMINTREQUEST']._serialized_end=2066
  _globals['_MSGMINTRESPONSE']._serialized_start=2068
  _globals['_MSGMINTRESPONSE']._serialized_end=2085
  _globals['_MSGBURNREQUEST']._serialized_start=2088
  _globals['_MSGBURNREQUEST']._serialized_end=2242
  _globals['_MSGBURNRESPONSE']._serialized_start=2244
  _globals['_MSGBURNRESPONSE']._serialized_end=2261
  _globals['_MSGWITHDRAWREQUEST']._serialized_start=2264
  _globals['_MSGWITHDRAWREQUEST']._serialized_end=2476
  _globals['_MSGWITHDRAWRESPONSE']._serialized_start=2478
  _globals['_MSGWITHDRAWRESPONSE']._serialized_end=2499
  _globals['_MSGTRANSFERREQUEST']._serialized_start=2502
  _globals['_MSGTRANSFERREQUEST']._serialized_end=2726
  _globals['_MSGTRANSFERRESPONSE']._serialized_start=2728
  _globals['_MSGTRANSFERRESPONSE']._serialized_end=2749
  _globals['_MSGIBCTRANSFERREQUEST']._serialized_start=2752
  _globals['_MSGIBCTRANSFERREQUEST']._serialized_end=2962
  _globals['_MSGIBCTRANSFERRESPONSE']._serialized_start=2964
  _globals['_MSGIBCTRANSFERRESPONSE']._serialized_end=2988
  _globals['_MSGSETDENOMMETADATAREQUEST']._serialized_start=2991
  _globals['_MSGSETDENOMMETADATAREQUEST']._serialized_end=3176
  _globals['_MSGSETDENOMMETADATARESPONSE']._serialized_start=3178
  _globals['_MSGSETDENOMMETADATARESPONSE']._serialized_end=3207
  _globals['_MSGADDFINALIZEACTIVATEMARKERREQUEST']._serialized_start=3210
  _globals['_MSGADDFINALIZEACTIVATEMARKERREQUEST']._serialized_end=3743
  _globals['_MSGADDFINALIZEACTIVATEMARKERRESPONSE']._serialized_start=3745
  _globals['_MSGADDFINALIZEACTIVATEMARKERRESPONSE']._serialized_end=3783
  _globals['_MSGSUPPLYINCREASEPROPOSALREQUEST']._serialized_start=3786
  _globals['_MSGSUPPLYINCREASEPROPOSALREQUEST']._serialized_end=4035
  _globals['_MSGSUPPLYINCREASEPROPOSALRESPONSE']._serialized_start=4037
  _globals['_MSGSUPPLYINCREASEPROPOSALRESPONSE']._serialized_end=4072
  _globals['_MSGUPDATEREQUIREDATTRIBUTESREQUEST']._serialized_start=4075
  _globals['_MSGUPDATEREQUIREDATTRIBUTESREQUEST']._serialized_end=4353
  _globals['_MSGUPDATEREQUIREDATTRIBUTESRESPONSE']._serialized_start=4355
  _globals['_MSGUPDATEREQUIREDATTRIBUTESRESPONSE']._serialized_end=4392
  _globals['_MSGUPDATEFORCEDTRANSFERREQUEST']._serialized_start=4395
  _globals['_MSGUPDATEFORCEDTRANSFERREQUEST']._serialized_end=4577
  _globals['_MSGUPDATEFORCEDTRANSFERRESPONSE']._serialized_start=4579
  _globals['_MSGUPDATEFORCEDTRANSFERRESPONSE']._serialized_end=4612
  _globals['_MSGSETACCOUNTDATAREQUEST']._serialized_start=4615
  _globals['_MSGSETACCOUNTDATAREQUEST']._serialized_end=4752
  _globals['_MSGSETACCOUNTDATARESPONSE']._serialized_start=4754
  _globals['_MSGSETACCOUNTDATARESPONSE']._serialized_end=4781
  _globals['_MSG']._serialized_start=4784
  _globals['_MSG']._serialized_end=6864
# @@protoc_insertion_point(module_scope)
