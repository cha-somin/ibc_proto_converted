// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/orders/key/key.proto

package com.assetmantle.modules.orders.key;

public final class KeyProto {
  private KeyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_orders_key_Key_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_orders_key_Key_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n assetmantle/orders/key/key.proto\022\036asse" +
      "tmantle.modules.orders.key\032#assetmantle/" +
      "ids/base/order_id.proto\"G\n\003Key\022@\n\torder_" +
      "i_d\030\001 \001(\0132$.assetmantle.schema.ids.base." +
      "OrderIDR\007orderIDB\312\001\n\"com.assetmantle.mod" +
      "ules.orders.keyB\010KeyProtoP\001\242\002\004AMOK\252\002\036Ass" +
      "etmantle.Modules.Orders.Key\312\002\036Assetmantl" +
      "e\\Modules\\Orders\\Key\342\002*Assetmantle\\Modul" +
      "es\\Orders\\Key\\GPBMetadata\352\002!Assetmantle:" +
      ":Modules::Orders::Keyb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.OrderIdProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_orders_key_Key_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_orders_key_Key_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_orders_key_Key_descriptor,
        new java.lang.String[] { "OrderID", });
    com.assetmantle.schema.ids.base.OrderIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
