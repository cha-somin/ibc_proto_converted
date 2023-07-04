// source: ibc/applications/interchain_accounts/v1/packet.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.ibc.applications.interchain_accounts.v1.CosmosTx');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.ibc.applications.interchain_accounts.v1.CosmosTx = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ibc.applications.interchain_accounts.v1.CosmosTx.repeatedFields_, null);
};
goog.inherits(proto.ibc.applications.interchain_accounts.v1.CosmosTx, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.applications.interchain_accounts.v1.CosmosTx.displayName = 'proto.ibc.applications.interchain_accounts.v1.CosmosTx';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ibc.applications.interchain_accounts.v1.CosmosTx.repeatedFields_ = [1];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.ibc.applications.interchain_accounts.v1.CosmosTx.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.applications.interchain_accounts.v1.CosmosTx.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.applications.interchain_accounts.v1.CosmosTx} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.interchain_accounts.v1.CosmosTx.toObject = function(includeInstance, msg) {
  var f, obj = {
    messagesList: jspb.Message.toObjectList(msg.getMessagesList(),
    proto.google.protobuf.Any.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.ibc.applications.interchain_accounts.v1.CosmosTx}
 */
proto.ibc.applications.interchain_accounts.v1.CosmosTx.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.applications.interchain_accounts.v1.CosmosTx;
  return proto.ibc.applications.interchain_accounts.v1.CosmosTx.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.applications.interchain_accounts.v1.CosmosTx} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.applications.interchain_accounts.v1.CosmosTx}
 */
proto.ibc.applications.interchain_accounts.v1.CosmosTx.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.addMessages(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.ibc.applications.interchain_accounts.v1.CosmosTx.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.applications.interchain_accounts.v1.CosmosTx.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.applications.interchain_accounts.v1.CosmosTx} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.interchain_accounts.v1.CosmosTx.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMessagesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
};


/**
 * repeated google.protobuf.Any messages = 1;
 * @return {!Array<!proto.google.protobuf.Any>}
 */
proto.ibc.applications.interchain_accounts.v1.CosmosTx.prototype.getMessagesList = function() {
  return /** @type{!Array<!proto.google.protobuf.Any>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Any, 1));
};


/**
 * @param {!Array<!proto.google.protobuf.Any>} value
 * @return {!proto.ibc.applications.interchain_accounts.v1.CosmosTx} returns this
*/
proto.ibc.applications.interchain_accounts.v1.CosmosTx.prototype.setMessagesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.google.protobuf.Any=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Any}
 */
proto.ibc.applications.interchain_accounts.v1.CosmosTx.prototype.addMessages = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.google.protobuf.Any, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ibc.applications.interchain_accounts.v1.CosmosTx} returns this
 */
proto.ibc.applications.interchain_accounts.v1.CosmosTx.prototype.clearMessagesList = function() {
  return this.setMessagesList([]);
};

