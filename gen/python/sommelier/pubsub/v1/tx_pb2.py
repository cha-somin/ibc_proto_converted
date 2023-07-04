# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sommelier/pubsub/v1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from sommelier.pubsub.v1 import pubsub_pb2 as sommelier_dot_pubsub_dot_v1_dot_pubsub__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1csommelier/pubsub/v1/tx.proto\x12\tpubsub.v1\x1a sommelier/pubsub/v1/pubsub.proto\"^\n\x19MsgRemovePublisherRequest\x12)\n\x10publisher_domain\x18\x01 \x01(\tR\x0fpublisherDomain\x12\x16\n\x06signer\x18\x02 \x01(\tR\x06signer\"\x1c\n\x1aMsgRemovePublisherResponse\"h\n\x17MsgAddSubscriberRequest\x12\x35\n\nsubscriber\x18\x01 \x01(\x0b\x32\x15.pubsub.v1.SubscriberR\nsubscriber\x12\x16\n\x06signer\x18\x02 \x01(\tR\x06signer\"\x1a\n\x18MsgAddSubscriberResponse\"c\n\x1aMsgRemoveSubscriberRequest\x12-\n\x12subscriber_address\x18\x01 \x01(\tR\x11subscriberAddress\x12\x16\n\x06signer\x18\x02 \x01(\tR\x06signer\"\x1d\n\x1bMsgRemoveSubscriberResponse\"}\n\x1cMsgAddPublisherIntentRequest\x12\x45\n\x10publisher_intent\x18\x01 \x01(\x0b\x32\x1a.pubsub.v1.PublisherIntentR\x0fpublisherIntent\x12\x16\n\x06signer\x18\x02 \x01(\tR\x06signer\"\x1f\n\x1dMsgAddPublisherIntentResponse\"\x8d\x01\n\x1fMsgRemovePublisherIntentRequest\x12\'\n\x0fsubscription_id\x18\x01 \x01(\tR\x0esubscriptionId\x12)\n\x10publisher_domain\x18\x02 \x01(\tR\x0fpublisherDomain\x12\x16\n\x06signer\x18\x03 \x01(\tR\x06signer\"\"\n MsgRemovePublisherIntentResponse\"\x81\x01\n\x1dMsgAddSubscriberIntentRequest\x12H\n\x11subscriber_intent\x18\x01 \x01(\x0b\x32\x1b.pubsub.v1.SubscriberIntentR\x10subscriberIntent\x12\x16\n\x06signer\x18\x02 \x01(\tR\x06signer\" \n\x1eMsgAddSubscriberIntentResponse\"\x92\x01\n MsgRemoveSubscriberIntentRequest\x12\'\n\x0fsubscription_id\x18\x01 \x01(\tR\x0esubscriptionId\x12-\n\x12subscriber_address\x18\x02 \x01(\tR\x11subscriberAddress\x12\x16\n\x06signer\x18\x03 \x01(\tR\x06signer\"#\n!MsgRemoveSubscriberIntentResponse2\xde\x05\n\x03Msg\x12^\n\x0fRemovePublisher\x12$.pubsub.v1.MsgRemovePublisherRequest\x1a%.pubsub.v1.MsgRemovePublisherResponse\x12X\n\rAddSubscriber\x12\".pubsub.v1.MsgAddSubscriberRequest\x1a#.pubsub.v1.MsgAddSubscriberResponse\x12\x61\n\x10RemoveSubscriber\x12%.pubsub.v1.MsgRemoveSubscriberRequest\x1a&.pubsub.v1.MsgRemoveSubscriberResponse\x12g\n\x12\x41\x64\x64PublisherIntent\x12\'.pubsub.v1.MsgAddPublisherIntentRequest\x1a(.pubsub.v1.MsgAddPublisherIntentResponse\x12p\n\x15RemovePublisherIntent\x12*.pubsub.v1.MsgRemovePublisherIntentRequest\x1a+.pubsub.v1.MsgRemovePublisherIntentResponse\x12j\n\x13\x41\x64\x64SubscriberIntent\x12(.pubsub.v1.MsgAddSubscriberIntentRequest\x1a).pubsub.v1.MsgAddSubscriberIntentResponse\x12s\n\x16RemoveSubscriberIntent\x12+.pubsub.v1.MsgRemoveSubscriberIntentRequest\x1a,.pubsub.v1.MsgRemoveSubscriberIntentResponseB\x8d\x01\n\rcom.pubsub.v1B\x07TxProtoP\x01Z.github.com/peggyjv/sommelier/v4/x/pubsub/types\xa2\x02\x03PXX\xaa\x02\tPubsub.V1\xca\x02\tPubsub\\V1\xe2\x02\x15Pubsub\\V1\\GPBMetadata\xea\x02\nPubsub::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sommelier.pubsub.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\rcom.pubsub.v1B\007TxProtoP\001Z.github.com/peggyjv/sommelier/v4/x/pubsub/types\242\002\003PXX\252\002\tPubsub.V1\312\002\tPubsub\\V1\342\002\025Pubsub\\V1\\GPBMetadata\352\002\nPubsub::V1'
  _globals['_MSGREMOVEPUBLISHERREQUEST']._serialized_start=77
  _globals['_MSGREMOVEPUBLISHERREQUEST']._serialized_end=171
  _globals['_MSGREMOVEPUBLISHERRESPONSE']._serialized_start=173
  _globals['_MSGREMOVEPUBLISHERRESPONSE']._serialized_end=201
  _globals['_MSGADDSUBSCRIBERREQUEST']._serialized_start=203
  _globals['_MSGADDSUBSCRIBERREQUEST']._serialized_end=307
  _globals['_MSGADDSUBSCRIBERRESPONSE']._serialized_start=309
  _globals['_MSGADDSUBSCRIBERRESPONSE']._serialized_end=335
  _globals['_MSGREMOVESUBSCRIBERREQUEST']._serialized_start=337
  _globals['_MSGREMOVESUBSCRIBERREQUEST']._serialized_end=436
  _globals['_MSGREMOVESUBSCRIBERRESPONSE']._serialized_start=438
  _globals['_MSGREMOVESUBSCRIBERRESPONSE']._serialized_end=467
  _globals['_MSGADDPUBLISHERINTENTREQUEST']._serialized_start=469
  _globals['_MSGADDPUBLISHERINTENTREQUEST']._serialized_end=594
  _globals['_MSGADDPUBLISHERINTENTRESPONSE']._serialized_start=596
  _globals['_MSGADDPUBLISHERINTENTRESPONSE']._serialized_end=627
  _globals['_MSGREMOVEPUBLISHERINTENTREQUEST']._serialized_start=630
  _globals['_MSGREMOVEPUBLISHERINTENTREQUEST']._serialized_end=771
  _globals['_MSGREMOVEPUBLISHERINTENTRESPONSE']._serialized_start=773
  _globals['_MSGREMOVEPUBLISHERINTENTRESPONSE']._serialized_end=807
  _globals['_MSGADDSUBSCRIBERINTENTREQUEST']._serialized_start=810
  _globals['_MSGADDSUBSCRIBERINTENTREQUEST']._serialized_end=939
  _globals['_MSGADDSUBSCRIBERINTENTRESPONSE']._serialized_start=941
  _globals['_MSGADDSUBSCRIBERINTENTRESPONSE']._serialized_end=973
  _globals['_MSGREMOVESUBSCRIBERINTENTREQUEST']._serialized_start=976
  _globals['_MSGREMOVESUBSCRIBERINTENTREQUEST']._serialized_end=1122
  _globals['_MSGREMOVESUBSCRIBERINTENTRESPONSE']._serialized_start=1124
  _globals['_MSGREMOVESUBSCRIBERINTENTRESPONSE']._serialized_end=1159
  _globals['_MSG']._serialized_start=1162
  _globals['_MSG']._serialized_end=1896
# @@protoc_insertion_point(module_scope)