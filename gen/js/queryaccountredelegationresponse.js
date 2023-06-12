// source: kyve/query/v1beta1/account.proto
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

goog.provide('proto.kyve.query.v1beta1.QueryAccountRedelegationResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kyve.query.v1beta1.RedelegationEntry');

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
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.repeatedFields_, null);
};
goog.inherits(proto.kyve.query.v1beta1.QueryAccountRedelegationResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.displayName = 'proto.kyve.query.v1beta1.QueryAccountRedelegationResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.repeatedFields_ = [1];



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
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.query.v1beta1.QueryAccountRedelegationResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    redelegationCooldownEntriesList: jspb.Message.toObjectList(msg.getRedelegationCooldownEntriesList(),
    proto.kyve.query.v1beta1.RedelegationEntry.toObject, includeInstance),
    availableSlots: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.kyve.query.v1beta1.QueryAccountRedelegationResponse}
 */
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.query.v1beta1.QueryAccountRedelegationResponse;
  return proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.query.v1beta1.QueryAccountRedelegationResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.query.v1beta1.QueryAccountRedelegationResponse}
 */
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.kyve.query.v1beta1.RedelegationEntry;
      reader.readMessage(value,proto.kyve.query.v1beta1.RedelegationEntry.deserializeBinaryFromReader);
      msg.addRedelegationCooldownEntries(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAvailableSlots(value);
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
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.query.v1beta1.QueryAccountRedelegationResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRedelegationCooldownEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.kyve.query.v1beta1.RedelegationEntry.serializeBinaryToWriter
    );
  }
  f = message.getAvailableSlots();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
};


/**
 * repeated RedelegationEntry redelegation_cooldown_entries = 1;
 * @return {!Array<!proto.kyve.query.v1beta1.RedelegationEntry>}
 */
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.prototype.getRedelegationCooldownEntriesList = function() {
  return /** @type{!Array<!proto.kyve.query.v1beta1.RedelegationEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.query.v1beta1.RedelegationEntry, 1));
};


/**
 * @param {!Array<!proto.kyve.query.v1beta1.RedelegationEntry>} value
 * @return {!proto.kyve.query.v1beta1.QueryAccountRedelegationResponse} returns this
*/
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.prototype.setRedelegationCooldownEntriesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.kyve.query.v1beta1.RedelegationEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.query.v1beta1.RedelegationEntry}
 */
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.prototype.addRedelegationCooldownEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.kyve.query.v1beta1.RedelegationEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.query.v1beta1.QueryAccountRedelegationResponse} returns this
 */
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.prototype.clearRedelegationCooldownEntriesList = function() {
  return this.setRedelegationCooldownEntriesList([]);
};


/**
 * optional uint64 available_slots = 2;
 * @return {number}
 */
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.prototype.getAvailableSlots = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.query.v1beta1.QueryAccountRedelegationResponse} returns this
 */
proto.kyve.query.v1beta1.QueryAccountRedelegationResponse.prototype.setAvailableSlots = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


