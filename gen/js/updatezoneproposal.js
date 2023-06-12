// source: quicksilver/interchainstaking/v1/proposals.proto
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

goog.provide('proto.quicksilver.interchainstaking.v1.UpdateZoneProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.quicksilver.interchainstaking.v1.UpdateZoneValue');

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
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.repeatedFields_, null);
};
goog.inherits(proto.quicksilver.interchainstaking.v1.UpdateZoneProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.displayName = 'proto.quicksilver.interchainstaking.v1.UpdateZoneProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.repeatedFields_ = [4];



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
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quicksilver.interchainstaking.v1.UpdateZoneProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    chainId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    changesList: jspb.Message.toObjectList(msg.getChangesList(),
    proto.quicksilver.interchainstaking.v1.UpdateZoneValue.toObject, includeInstance)
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
 * @return {!proto.quicksilver.interchainstaking.v1.UpdateZoneProposal}
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quicksilver.interchainstaking.v1.UpdateZoneProposal;
  return proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quicksilver.interchainstaking.v1.UpdateZoneProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quicksilver.interchainstaking.v1.UpdateZoneProposal}
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setChainId(value);
      break;
    case 4:
      var value = new proto.quicksilver.interchainstaking.v1.UpdateZoneValue;
      reader.readMessage(value,proto.quicksilver.interchainstaking.v1.UpdateZoneValue.deserializeBinaryFromReader);
      msg.addChanges(value);
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
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quicksilver.interchainstaking.v1.UpdateZoneProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getChainId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getChangesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.quicksilver.interchainstaking.v1.UpdateZoneValue.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.UpdateZoneProposal} returns this
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.UpdateZoneProposal} returns this
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string chain_id = 3;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.prototype.getChainId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.UpdateZoneProposal} returns this
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.prototype.setChainId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated UpdateZoneValue changes = 4;
 * @return {!Array<!proto.quicksilver.interchainstaking.v1.UpdateZoneValue>}
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.prototype.getChangesList = function() {
  return /** @type{!Array<!proto.quicksilver.interchainstaking.v1.UpdateZoneValue>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.quicksilver.interchainstaking.v1.UpdateZoneValue, 4));
};


/**
 * @param {!Array<!proto.quicksilver.interchainstaking.v1.UpdateZoneValue>} value
 * @return {!proto.quicksilver.interchainstaking.v1.UpdateZoneProposal} returns this
*/
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.prototype.setChangesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.quicksilver.interchainstaking.v1.UpdateZoneValue=} opt_value
 * @param {number=} opt_index
 * @return {!proto.quicksilver.interchainstaking.v1.UpdateZoneValue}
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.prototype.addChanges = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.quicksilver.interchainstaking.v1.UpdateZoneValue, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.quicksilver.interchainstaking.v1.UpdateZoneProposal} returns this
 */
proto.quicksilver.interchainstaking.v1.UpdateZoneProposal.prototype.clearChangesList = function() {
  return this.setChangesList([]);
};


