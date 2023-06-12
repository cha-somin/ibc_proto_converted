# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irismod/service/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18irismod/service/tx.proto\x12\x0firismod.service\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\"\xdc\x01\n\x10MsgDefineService\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x12\n\x04tags\x18\x03 \x03(\tR\x04tags\x12\x16\n\x06\x61uthor\x18\x04 \x01(\tR\x06\x61uthor\x12L\n\x12\x61uthor_description\x18\x05 \x01(\tB\x1d\xf2\xde\x1f\x19yaml:\"author_description\"R\x11\x61uthorDescription\x12\x18\n\x07schemas\x18\x06 \x01(\tR\x07schemas\"\x1a\n\x18MsgDefineServiceResponse\"\xb4\x02\n\x0eMsgBindService\x12:\n\x0cservice_name\x18\x01 \x01(\tB\x17\xf2\xde\x1f\x13yaml:\"service_name\"R\x0bserviceName\x12\x1a\n\x08provider\x18\x02 \x01(\tR\x08provider\x12\x65\n\x07\x64\x65posit\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x07\x64\x65posit\x12\x18\n\x07pricing\x18\x04 \x01(\tR\x07pricing\x12\x19\n\x03qos\x18\x05 \x01(\x04\x42\x07\xe2\xde\x1f\x03QoSR\x03qos\x12\x18\n\x07options\x18\x06 \x01(\tR\x07options\x12\x14\n\x05owner\x18\x07 \x01(\tR\x05owner\"\x18\n\x16MsgBindServiceResponse\"\xbd\x02\n\x17MsgUpdateServiceBinding\x12:\n\x0cservice_name\x18\x01 \x01(\tB\x17\xf2\xde\x1f\x13yaml:\"service_name\"R\x0bserviceName\x12\x1a\n\x08provider\x18\x02 \x01(\tR\x08provider\x12\x65\n\x07\x64\x65posit\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x07\x64\x65posit\x12\x18\n\x07pricing\x18\x04 \x01(\tR\x07pricing\x12\x19\n\x03qos\x18\x05 \x01(\x04\x42\x07\xe2\xde\x1f\x03QoSR\x03qos\x12\x18\n\x07options\x18\x06 \x01(\tR\x07options\x12\x14\n\x05owner\x18\x07 \x01(\tR\x05owner\"!\n\x1fMsgUpdateServiceBindingResponse\"u\n\x15MsgSetWithdrawAddress\x12\x14\n\x05owner\x18\x01 \x01(\tR\x05owner\x12\x46\n\x10withdraw_address\x18\x02 \x01(\tB\x1b\xf2\xde\x1f\x17yaml:\"withdraw_address\"R\x0fwithdrawAddress\"\x1f\n\x1dMsgSetWithdrawAddressResponse\"\x88\x01\n\x18MsgDisableServiceBinding\x12:\n\x0cservice_name\x18\x01 \x01(\tB\x17\xf2\xde\x1f\x13yaml:\"service_name\"R\x0bserviceName\x12\x1a\n\x08provider\x18\x02 \x01(\tR\x08provider\x12\x14\n\x05owner\x18\x03 \x01(\tR\x05owner\"\"\n MsgDisableServiceBindingResponse\"\xee\x01\n\x17MsgEnableServiceBinding\x12:\n\x0cservice_name\x18\x01 \x01(\tB\x17\xf2\xde\x1f\x13yaml:\"service_name\"R\x0bserviceName\x12\x1a\n\x08provider\x18\x02 \x01(\tR\x08provider\x12\x65\n\x07\x64\x65posit\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x07\x64\x65posit\x12\x14\n\x05owner\x18\x04 \x01(\tR\x05owner\"!\n\x1fMsgEnableServiceBindingResponse\"\x87\x01\n\x17MsgRefundServiceDeposit\x12:\n\x0cservice_name\x18\x01 \x01(\tB\x17\xf2\xde\x1f\x13yaml:\"service_name\"R\x0bserviceName\x12\x1a\n\x08provider\x18\x02 \x01(\tR\x08provider\x12\x14\n\x05owner\x18\x03 \x01(\tR\x05owner\"!\n\x1fMsgRefundServiceDepositResponse\"\xf2\x03\n\x0eMsgCallService\x12:\n\x0cservice_name\x18\x01 \x01(\tB\x17\xf2\xde\x1f\x13yaml:\"service_name\"R\x0bserviceName\x12\x1c\n\tproviders\x18\x02 \x03(\tR\tproviders\x12\x1a\n\x08\x63onsumer\x18\x03 \x01(\tR\x08\x63onsumer\x12\x14\n\x05input\x18\x04 \x01(\tR\x05input\x12\x8d\x01\n\x0fservice_fee_cap\x18\x05 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBJ\xc8\xde\x1f\x00\xf2\xde\x1f\x16yaml:\"service_fee_cap\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\rserviceFeeCap\x12\x18\n\x07timeout\x18\x06 \x01(\x03R\x07timeout\x12\x1a\n\x08repeated\x18\x07 \x01(\x08R\x08repeated\x12L\n\x12repeated_frequency\x18\x08 \x01(\x04\x42\x1d\xf2\xde\x1f\x19yaml:\"repeated_frequency\"R\x11repeatedFrequency\x12@\n\x0erepeated_total\x18\t \x01(\x03\x42\x19\xf2\xde\x1f\x15yaml:\"repeated_total\"R\rrepeatedTotal\"e\n\x16MsgCallServiceResponse\x12K\n\x12request_context_id\x18\x01 \x01(\tB\x1d\xf2\xde\x1f\x19yaml:\"request_context_id\"R\x10requestContextId\"\x95\x01\n\x11MsgRespondService\x12\x34\n\nrequest_id\x18\x01 \x01(\tB\x15\xf2\xde\x1f\x11yaml:\"request_id\"R\trequestId\x12\x1a\n\x08provider\x18\x02 \x01(\tR\x08provider\x12\x16\n\x06result\x18\x03 \x01(\tR\x06result\x12\x16\n\x06output\x18\x04 \x01(\tR\x06output\"\x1b\n\x19MsgRespondServiceResponse\"\x81\x01\n\x16MsgPauseRequestContext\x12K\n\x12request_context_id\x18\x01 \x01(\tB\x1d\xf2\xde\x1f\x19yaml:\"request_context_id\"R\x10requestContextId\x12\x1a\n\x08\x63onsumer\x18\x02 \x01(\tR\x08\x63onsumer\" \n\x1eMsgPauseRequestContextResponse\"\x81\x01\n\x16MsgStartRequestContext\x12K\n\x12request_context_id\x18\x01 \x01(\tB\x1d\xf2\xde\x1f\x19yaml:\"request_context_id\"R\x10requestContextId\x12\x1a\n\x08\x63onsumer\x18\x02 \x01(\tR\x08\x63onsumer\" \n\x1eMsgStartRequestContextResponse\"\x80\x01\n\x15MsgKillRequestContext\x12K\n\x12request_context_id\x18\x01 \x01(\tB\x1d\xf2\xde\x1f\x19yaml:\"request_context_id\"R\x10requestContextId\x12\x1a\n\x08\x63onsumer\x18\x02 \x01(\tR\x08\x63onsumer\"\x1f\n\x1dMsgKillRequestContextResponse\"\xda\x03\n\x17MsgUpdateRequestContext\x12K\n\x12request_context_id\x18\x01 \x01(\tB\x1d\xf2\xde\x1f\x19yaml:\"request_context_id\"R\x10requestContextId\x12\x1c\n\tproviders\x18\x02 \x03(\tR\tproviders\x12\x1a\n\x08\x63onsumer\x18\x03 \x01(\tR\x08\x63onsumer\x12\x8d\x01\n\x0fservice_fee_cap\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBJ\xc8\xde\x1f\x00\xf2\xde\x1f\x16yaml:\"service_fee_cap\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\rserviceFeeCap\x12\x18\n\x07timeout\x18\x05 \x01(\x03R\x07timeout\x12L\n\x12repeated_frequency\x18\x06 \x01(\x04\x42\x1d\xf2\xde\x1f\x19yaml:\"repeated_frequency\"R\x11repeatedFrequency\x12@\n\x0erepeated_total\x18\x07 \x01(\x03\x42\x19\xf2\xde\x1f\x15yaml:\"repeated_total\"R\rrepeatedTotal\"!\n\x1fMsgUpdateRequestContextResponse\"I\n\x15MsgWithdrawEarnedFees\x12\x14\n\x05owner\x18\x01 \x01(\tR\x05owner\x12\x1a\n\x08provider\x18\x02 \x01(\tR\x08provider\"\x1f\n\x1dMsgWithdrawEarnedFeesResponse2\xeb\x0b\n\x03Msg\x12]\n\rDefineService\x12!.irismod.service.MsgDefineService\x1a).irismod.service.MsgDefineServiceResponse\x12W\n\x0b\x42indService\x12\x1f.irismod.service.MsgBindService\x1a\'.irismod.service.MsgBindServiceResponse\x12r\n\x14UpdateServiceBinding\x12(.irismod.service.MsgUpdateServiceBinding\x1a\x30.irismod.service.MsgUpdateServiceBindingResponse\x12l\n\x12SetWithdrawAddress\x12&.irismod.service.MsgSetWithdrawAddress\x1a..irismod.service.MsgSetWithdrawAddressResponse\x12r\n\x14\x45nableServiceBinding\x12(.irismod.service.MsgEnableServiceBinding\x1a\x30.irismod.service.MsgEnableServiceBindingResponse\x12u\n\x15\x44isableServiceBinding\x12).irismod.service.MsgDisableServiceBinding\x1a\x31.irismod.service.MsgDisableServiceBindingResponse\x12r\n\x14RefundServiceDeposit\x12(.irismod.service.MsgRefundServiceDeposit\x1a\x30.irismod.service.MsgRefundServiceDepositResponse\x12W\n\x0b\x43\x61llService\x12\x1f.irismod.service.MsgCallService\x1a\'.irismod.service.MsgCallServiceResponse\x12`\n\x0eRespondService\x12\".irismod.service.MsgRespondService\x1a*.irismod.service.MsgRespondServiceResponse\x12o\n\x13PauseRequestContext\x12\'.irismod.service.MsgPauseRequestContext\x1a/.irismod.service.MsgPauseRequestContextResponse\x12o\n\x13StartRequestContext\x12\'.irismod.service.MsgStartRequestContext\x1a/.irismod.service.MsgStartRequestContextResponse\x12l\n\x12KillRequestContext\x12&.irismod.service.MsgKillRequestContext\x1a..irismod.service.MsgKillRequestContextResponse\x12r\n\x14UpdateRequestContext\x12(.irismod.service.MsgUpdateRequestContext\x1a\x30.irismod.service.MsgUpdateRequestContextResponse\x12l\n\x12WithdrawEarnedFees\x12&.irismod.service.MsgWithdrawEarnedFees\x1a..irismod.service.MsgWithdrawEarnedFeesResponseB\xb1\x01\n\x13\x63om.irismod.serviceB\x07TxProtoP\x01Z0github.com/irisnet/irismod/modules/service/types\xa2\x02\x03ISX\xaa\x02\x0fIrismod.Service\xca\x02\x0fIrismod\\Service\xe2\x02\x1bIrismod\\Service\\GPBMetadata\xea\x02\x10Irismod::Service\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irismod.service.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\023com.irismod.serviceB\007TxProtoP\001Z0github.com/irisnet/irismod/modules/service/types\242\002\003ISX\252\002\017Irismod.Service\312\002\017Irismod\\Service\342\002\033Irismod\\Service\\GPBMetadata\352\002\020Irismod::Service\310\341\036\000'
  _MSGDEFINESERVICE.fields_by_name['author_description']._options = None
  _MSGDEFINESERVICE.fields_by_name['author_description']._serialized_options = b'\362\336\037\031yaml:\"author_description\"'
  _MSGBINDSERVICE.fields_by_name['service_name']._options = None
  _MSGBINDSERVICE.fields_by_name['service_name']._serialized_options = b'\362\336\037\023yaml:\"service_name\"'
  _MSGBINDSERVICE.fields_by_name['deposit']._options = None
  _MSGBINDSERVICE.fields_by_name['deposit']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _MSGBINDSERVICE.fields_by_name['qos']._options = None
  _MSGBINDSERVICE.fields_by_name['qos']._serialized_options = b'\342\336\037\003QoS'
  _MSGUPDATESERVICEBINDING.fields_by_name['service_name']._options = None
  _MSGUPDATESERVICEBINDING.fields_by_name['service_name']._serialized_options = b'\362\336\037\023yaml:\"service_name\"'
  _MSGUPDATESERVICEBINDING.fields_by_name['deposit']._options = None
  _MSGUPDATESERVICEBINDING.fields_by_name['deposit']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _MSGUPDATESERVICEBINDING.fields_by_name['qos']._options = None
  _MSGUPDATESERVICEBINDING.fields_by_name['qos']._serialized_options = b'\342\336\037\003QoS'
  _MSGSETWITHDRAWADDRESS.fields_by_name['withdraw_address']._options = None
  _MSGSETWITHDRAWADDRESS.fields_by_name['withdraw_address']._serialized_options = b'\362\336\037\027yaml:\"withdraw_address\"'
  _MSGDISABLESERVICEBINDING.fields_by_name['service_name']._options = None
  _MSGDISABLESERVICEBINDING.fields_by_name['service_name']._serialized_options = b'\362\336\037\023yaml:\"service_name\"'
  _MSGENABLESERVICEBINDING.fields_by_name['service_name']._options = None
  _MSGENABLESERVICEBINDING.fields_by_name['service_name']._serialized_options = b'\362\336\037\023yaml:\"service_name\"'
  _MSGENABLESERVICEBINDING.fields_by_name['deposit']._options = None
  _MSGENABLESERVICEBINDING.fields_by_name['deposit']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _MSGREFUNDSERVICEDEPOSIT.fields_by_name['service_name']._options = None
  _MSGREFUNDSERVICEDEPOSIT.fields_by_name['service_name']._serialized_options = b'\362\336\037\023yaml:\"service_name\"'
  _MSGCALLSERVICE.fields_by_name['service_name']._options = None
  _MSGCALLSERVICE.fields_by_name['service_name']._serialized_options = b'\362\336\037\023yaml:\"service_name\"'
  _MSGCALLSERVICE.fields_by_name['service_fee_cap']._options = None
  _MSGCALLSERVICE.fields_by_name['service_fee_cap']._serialized_options = b'\310\336\037\000\362\336\037\026yaml:\"service_fee_cap\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _MSGCALLSERVICE.fields_by_name['repeated_frequency']._options = None
  _MSGCALLSERVICE.fields_by_name['repeated_frequency']._serialized_options = b'\362\336\037\031yaml:\"repeated_frequency\"'
  _MSGCALLSERVICE.fields_by_name['repeated_total']._options = None
  _MSGCALLSERVICE.fields_by_name['repeated_total']._serialized_options = b'\362\336\037\025yaml:\"repeated_total\"'
  _MSGCALLSERVICERESPONSE.fields_by_name['request_context_id']._options = None
  _MSGCALLSERVICERESPONSE.fields_by_name['request_context_id']._serialized_options = b'\362\336\037\031yaml:\"request_context_id\"'
  _MSGRESPONDSERVICE.fields_by_name['request_id']._options = None
  _MSGRESPONDSERVICE.fields_by_name['request_id']._serialized_options = b'\362\336\037\021yaml:\"request_id\"'
  _MSGPAUSEREQUESTCONTEXT.fields_by_name['request_context_id']._options = None
  _MSGPAUSEREQUESTCONTEXT.fields_by_name['request_context_id']._serialized_options = b'\362\336\037\031yaml:\"request_context_id\"'
  _MSGSTARTREQUESTCONTEXT.fields_by_name['request_context_id']._options = None
  _MSGSTARTREQUESTCONTEXT.fields_by_name['request_context_id']._serialized_options = b'\362\336\037\031yaml:\"request_context_id\"'
  _MSGKILLREQUESTCONTEXT.fields_by_name['request_context_id']._options = None
  _MSGKILLREQUESTCONTEXT.fields_by_name['request_context_id']._serialized_options = b'\362\336\037\031yaml:\"request_context_id\"'
  _MSGUPDATEREQUESTCONTEXT.fields_by_name['request_context_id']._options = None
  _MSGUPDATEREQUESTCONTEXT.fields_by_name['request_context_id']._serialized_options = b'\362\336\037\031yaml:\"request_context_id\"'
  _MSGUPDATEREQUESTCONTEXT.fields_by_name['service_fee_cap']._options = None
  _MSGUPDATEREQUESTCONTEXT.fields_by_name['service_fee_cap']._serialized_options = b'\310\336\037\000\362\336\037\026yaml:\"service_fee_cap\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _MSGUPDATEREQUESTCONTEXT.fields_by_name['repeated_frequency']._options = None
  _MSGUPDATEREQUESTCONTEXT.fields_by_name['repeated_frequency']._serialized_options = b'\362\336\037\031yaml:\"repeated_frequency\"'
  _MSGUPDATEREQUESTCONTEXT.fields_by_name['repeated_total']._options = None
  _MSGUPDATEREQUESTCONTEXT.fields_by_name['repeated_total']._serialized_options = b'\362\336\037\025yaml:\"repeated_total\"'
  _globals['_MSGDEFINESERVICE']._serialized_start=100
  _globals['_MSGDEFINESERVICE']._serialized_end=320
  _globals['_MSGDEFINESERVICERESPONSE']._serialized_start=322
  _globals['_MSGDEFINESERVICERESPONSE']._serialized_end=348
  _globals['_MSGBINDSERVICE']._serialized_start=351
  _globals['_MSGBINDSERVICE']._serialized_end=659
  _globals['_MSGBINDSERVICERESPONSE']._serialized_start=661
  _globals['_MSGBINDSERVICERESPONSE']._serialized_end=685
  _globals['_MSGUPDATESERVICEBINDING']._serialized_start=688
  _globals['_MSGUPDATESERVICEBINDING']._serialized_end=1005
  _globals['_MSGUPDATESERVICEBINDINGRESPONSE']._serialized_start=1007
  _globals['_MSGUPDATESERVICEBINDINGRESPONSE']._serialized_end=1040
  _globals['_MSGSETWITHDRAWADDRESS']._serialized_start=1042
  _globals['_MSGSETWITHDRAWADDRESS']._serialized_end=1159
  _globals['_MSGSETWITHDRAWADDRESSRESPONSE']._serialized_start=1161
  _globals['_MSGSETWITHDRAWADDRESSRESPONSE']._serialized_end=1192
  _globals['_MSGDISABLESERVICEBINDING']._serialized_start=1195
  _globals['_MSGDISABLESERVICEBINDING']._serialized_end=1331
  _globals['_MSGDISABLESERVICEBINDINGRESPONSE']._serialized_start=1333
  _globals['_MSGDISABLESERVICEBINDINGRESPONSE']._serialized_end=1367
  _globals['_MSGENABLESERVICEBINDING']._serialized_start=1370
  _globals['_MSGENABLESERVICEBINDING']._serialized_end=1608
  _globals['_MSGENABLESERVICEBINDINGRESPONSE']._serialized_start=1610
  _globals['_MSGENABLESERVICEBINDINGRESPONSE']._serialized_end=1643
  _globals['_MSGREFUNDSERVICEDEPOSIT']._serialized_start=1646
  _globals['_MSGREFUNDSERVICEDEPOSIT']._serialized_end=1781
  _globals['_MSGREFUNDSERVICEDEPOSITRESPONSE']._serialized_start=1783
  _globals['_MSGREFUNDSERVICEDEPOSITRESPONSE']._serialized_end=1816
  _globals['_MSGCALLSERVICE']._serialized_start=1819
  _globals['_MSGCALLSERVICE']._serialized_end=2317
  _globals['_MSGCALLSERVICERESPONSE']._serialized_start=2319
  _globals['_MSGCALLSERVICERESPONSE']._serialized_end=2420
  _globals['_MSGRESPONDSERVICE']._serialized_start=2423
  _globals['_MSGRESPONDSERVICE']._serialized_end=2572
  _globals['_MSGRESPONDSERVICERESPONSE']._serialized_start=2574
  _globals['_MSGRESPONDSERVICERESPONSE']._serialized_end=2601
  _globals['_MSGPAUSEREQUESTCONTEXT']._serialized_start=2604
  _globals['_MSGPAUSEREQUESTCONTEXT']._serialized_end=2733
  _globals['_MSGPAUSEREQUESTCONTEXTRESPONSE']._serialized_start=2735
  _globals['_MSGPAUSEREQUESTCONTEXTRESPONSE']._serialized_end=2767
  _globals['_MSGSTARTREQUESTCONTEXT']._serialized_start=2770
  _globals['_MSGSTARTREQUESTCONTEXT']._serialized_end=2899
  _globals['_MSGSTARTREQUESTCONTEXTRESPONSE']._serialized_start=2901
  _globals['_MSGSTARTREQUESTCONTEXTRESPONSE']._serialized_end=2933
  _globals['_MSGKILLREQUESTCONTEXT']._serialized_start=2936
  _globals['_MSGKILLREQUESTCONTEXT']._serialized_end=3064
  _globals['_MSGKILLREQUESTCONTEXTRESPONSE']._serialized_start=3066
  _globals['_MSGKILLREQUESTCONTEXTRESPONSE']._serialized_end=3097
  _globals['_MSGUPDATEREQUESTCONTEXT']._serialized_start=3100
  _globals['_MSGUPDATEREQUESTCONTEXT']._serialized_end=3574
  _globals['_MSGUPDATEREQUESTCONTEXTRESPONSE']._serialized_start=3576
  _globals['_MSGUPDATEREQUESTCONTEXTRESPONSE']._serialized_end=3609
  _globals['_MSGWITHDRAWEARNEDFEES']._serialized_start=3611
  _globals['_MSGWITHDRAWEARNEDFEES']._serialized_end=3684
  _globals['_MSGWITHDRAWEARNEDFEESRESPONSE']._serialized_start=3686
  _globals['_MSGWITHDRAWEARNEDFEESRESPONSE']._serialized_end=3717
  _globals['_MSG']._serialized_start=3720
  _globals['_MSG']._serialized_end=5235
# @@protoc_insertion_point(module_scope)
