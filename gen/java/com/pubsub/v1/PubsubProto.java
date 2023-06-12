// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/pubsub/v1/pubsub.proto

package com.pubsub.v1;

public final class PubsubProto {
  private PubsubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_Publisher_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_Publisher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_Subscriber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_Subscriber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_PublisherIntent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_PublisherIntent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_SubscriberIntent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_SubscriberIntent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_DefaultSubscription_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_DefaultSubscription_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_AddPublisherProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_AddPublisherProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_AddPublisherProposalWithDeposit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_AddPublisherProposalWithDeposit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_RemovePublisherProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_RemovePublisherProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_RemovePublisherProposalWithDeposit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_RemovePublisherProposalWithDeposit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_AddDefaultSubscriptionProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_AddDefaultSubscriptionProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_AddDefaultSubscriptionProposalWithDeposit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_AddDefaultSubscriptionProposalWithDeposit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_RemoveDefaultSubscriptionProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_RemoveDefaultSubscriptionProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pubsub_v1_RemoveDefaultSubscriptionProposalWithDeposit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pubsub_v1_RemoveDefaultSubscriptionProposalWithDeposit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n sommelier/pubsub/v1/pubsub.proto\022\tpubs" +
      "ub.v1\"V\n\tPublisher\022\030\n\007address\030\001 \001(\tR\007add" +
      "ress\022\026\n\006domain\030\002 \001(\tR\006domain\022\027\n\007ca_cert\030" +
      "\003 \001(\tR\006caCert\"W\n\nSubscriber\022\030\n\007address\030\001" +
      " \001(\tR\007address\022\026\n\006domain\030\002 \001(\tR\006domain\022\027\n" +
      "\007ca_cert\030\003 \001(\tR\006caCert\"\257\002\n\017PublisherInte" +
      "nt\022\'\n\017subscription_id\030\001 \001(\tR\016subscriptio" +
      "nId\022)\n\020publisher_domain\030\002 \001(\tR\017publisher" +
      "Domain\0220\n\006method\030\003 \001(\0162\030.pubsub.v1.Publi" +
      "shMethodR\006method\022\031\n\010pull_url\030\004 \001(\tR\007pull" +
      "Url\022N\n\023allowed_subscribers\030\005 \001(\0162\035.pubsu" +
      "b.v1.AllowedSubscribersR\022allowedSubscrib" +
      "ers\022+\n\021allowed_addresses\030\006 \003(\tR\020allowedA" +
      "ddresses\"\260\001\n\020SubscriberIntent\022\'\n\017subscri" +
      "ption_id\030\001 \001(\tR\016subscriptionId\022-\n\022subscr" +
      "iber_address\030\002 \001(\tR\021subscriberAddress\022)\n" +
      "\020publisher_domain\030\003 \001(\tR\017publisherDomain" +
      "\022\031\n\010push_url\030\004 \001(\tR\007pushUrl\"i\n\023DefaultSu" +
      "bscription\022\'\n\017subscription_id\030\001 \001(\tR\016sub" +
      "scriptionId\022)\n\020publisher_domain\030\002 \001(\tR\017p" +
      "ublisherDomain\"\266\001\n\024AddPublisherProposal\022" +
      "\024\n\005title\030\001 \001(\tR\005title\022 \n\013description\030\002 \001" +
      "(\tR\013description\022\026\n\006domain\030\003 \001(\tR\006domain\022" +
      "\030\n\007address\030\004 \001(\tR\007address\022\033\n\tproof_url\030\005" +
      " \001(\tR\010proofUrl\022\027\n\007ca_cert\030\006 \001(\tR\006caCert\"" +
      "\333\001\n\037AddPublisherProposalWithDeposit\022\024\n\005t" +
      "itle\030\001 \001(\tR\005title\022 \n\013description\030\002 \001(\tR\013" +
      "description\022\026\n\006domain\030\003 \001(\tR\006domain\022\030\n\007a" +
      "ddress\030\004 \001(\tR\007address\022\033\n\tproof_url\030\005 \001(\t" +
      "R\010proofUrl\022\027\n\007ca_cert\030\006 \001(\tR\006caCert\022\030\n\007d" +
      "eposit\030\007 \001(\tR\007deposit\"i\n\027RemovePublisher" +
      "Proposal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013descri" +
      "ption\030\002 \001(\tR\013description\022\026\n\006domain\030\003 \001(\t" +
      "R\006domain\"\216\001\n\"RemovePublisherProposalWith" +
      "Deposit\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013descrip" +
      "tion\030\002 \001(\tR\013description\022\026\n\006domain\030\003 \001(\tR" +
      "\006domain\022\030\n\007deposit\030\004 \001(\tR\007deposit\"\254\001\n\036Ad" +
      "dDefaultSubscriptionProposal\022\024\n\005title\030\001 " +
      "\001(\tR\005title\022 \n\013description\030\002 \001(\tR\013descrip" +
      "tion\022\'\n\017subscription_id\030\003 \001(\tR\016subscript" +
      "ionId\022)\n\020publisher_domain\030\004 \001(\tR\017publish" +
      "erDomain\"\321\001\n)AddDefaultSubscriptionPropo" +
      "salWithDeposit\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013" +
      "description\030\002 \001(\tR\013description\022\'\n\017subscr" +
      "iption_id\030\003 \001(\tR\016subscriptionId\022)\n\020publi" +
      "sher_domain\030\004 \001(\tR\017publisherDomain\022\030\n\007de" +
      "posit\030\005 \001(\tR\007deposit\"\204\001\n!RemoveDefaultSu" +
      "bscriptionProposal\022\024\n\005title\030\001 \001(\tR\005title" +
      "\022 \n\013description\030\002 \001(\tR\013description\022\'\n\017su" +
      "bscription_id\030\003 \001(\tR\016subscriptionId\"\251\001\n," +
      "RemoveDefaultSubscriptionProposalWithDep" +
      "osit\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013descriptio" +
      "n\030\002 \001(\tR\013description\022\'\n\017subscription_id\030" +
      "\003 \001(\tR\016subscriptionId\022\030\n\007deposit\030\004 \001(\tR\007" +
      "deposit*#\n\rPublishMethod\022\010\n\004PULL\020\000\022\010\n\004PU" +
      "SH\020\001*7\n\022AllowedSubscribers\022\007\n\003ANY\020\000\022\016\n\nV" +
      "ALIDATORS\020\001\022\010\n\004LIST\020\002B\221\001\n\rcom.pubsub.v1B" +
      "\013PubsubProtoP\001Z.github.com/peggyjv/somme" +
      "lier/v4/x/pubsub/types\242\002\003PXX\252\002\tPubsub.V1" +
      "\312\002\tPubsub\\V1\342\002\025Pubsub\\V1\\GPBMetadata\352\002\nP" +
      "ubsub::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_pubsub_v1_Publisher_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_pubsub_v1_Publisher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_Publisher_descriptor,
        new java.lang.String[] { "Address", "Domain", "CaCert", });
    internal_static_pubsub_v1_Subscriber_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_pubsub_v1_Subscriber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_Subscriber_descriptor,
        new java.lang.String[] { "Address", "Domain", "CaCert", });
    internal_static_pubsub_v1_PublisherIntent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_pubsub_v1_PublisherIntent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_PublisherIntent_descriptor,
        new java.lang.String[] { "SubscriptionId", "PublisherDomain", "Method", "PullUrl", "AllowedSubscribers", "AllowedAddresses", });
    internal_static_pubsub_v1_SubscriberIntent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_pubsub_v1_SubscriberIntent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_SubscriberIntent_descriptor,
        new java.lang.String[] { "SubscriptionId", "SubscriberAddress", "PublisherDomain", "PushUrl", });
    internal_static_pubsub_v1_DefaultSubscription_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_pubsub_v1_DefaultSubscription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_DefaultSubscription_descriptor,
        new java.lang.String[] { "SubscriptionId", "PublisherDomain", });
    internal_static_pubsub_v1_AddPublisherProposal_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_pubsub_v1_AddPublisherProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_AddPublisherProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Domain", "Address", "ProofUrl", "CaCert", });
    internal_static_pubsub_v1_AddPublisherProposalWithDeposit_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_pubsub_v1_AddPublisherProposalWithDeposit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_AddPublisherProposalWithDeposit_descriptor,
        new java.lang.String[] { "Title", "Description", "Domain", "Address", "ProofUrl", "CaCert", "Deposit", });
    internal_static_pubsub_v1_RemovePublisherProposal_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_pubsub_v1_RemovePublisherProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_RemovePublisherProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Domain", });
    internal_static_pubsub_v1_RemovePublisherProposalWithDeposit_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_pubsub_v1_RemovePublisherProposalWithDeposit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_RemovePublisherProposalWithDeposit_descriptor,
        new java.lang.String[] { "Title", "Description", "Domain", "Deposit", });
    internal_static_pubsub_v1_AddDefaultSubscriptionProposal_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_pubsub_v1_AddDefaultSubscriptionProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_AddDefaultSubscriptionProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "SubscriptionId", "PublisherDomain", });
    internal_static_pubsub_v1_AddDefaultSubscriptionProposalWithDeposit_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_pubsub_v1_AddDefaultSubscriptionProposalWithDeposit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_AddDefaultSubscriptionProposalWithDeposit_descriptor,
        new java.lang.String[] { "Title", "Description", "SubscriptionId", "PublisherDomain", "Deposit", });
    internal_static_pubsub_v1_RemoveDefaultSubscriptionProposal_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_pubsub_v1_RemoveDefaultSubscriptionProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_RemoveDefaultSubscriptionProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "SubscriptionId", });
    internal_static_pubsub_v1_RemoveDefaultSubscriptionProposalWithDeposit_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_pubsub_v1_RemoveDefaultSubscriptionProposalWithDeposit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pubsub_v1_RemoveDefaultSubscriptionProposalWithDeposit_descriptor,
        new java.lang.String[] { "Title", "Description", "SubscriptionId", "Deposit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
