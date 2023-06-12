// source: cosmos/staking/v1beta1/staking.proto
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

goog.provide('proto.cosmos.staking.v1beta1.RedelegationResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.staking.v1beta1.Redelegation');
goog.require('proto.cosmos.staking.v1beta1.RedelegationEntryResponse');

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
proto.cosmos.staking.v1beta1.RedelegationResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.staking.v1beta1.RedelegationResponse.repeatedFields_, null);
};
goog.inherits(proto.cosmos.staking.v1beta1.RedelegationResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.staking.v1beta1.RedelegationResponse.displayName = 'proto.cosmos.staking.v1beta1.RedelegationResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.staking.v1beta1.RedelegationResponse.repeatedFields_ = [2];



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
proto.cosmos.staking.v1beta1.RedelegationResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.staking.v1beta1.RedelegationResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.staking.v1beta1.RedelegationResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.staking.v1beta1.RedelegationResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    redelegation: (f = msg.getRedelegation()) && proto.cosmos.staking.v1beta1.Redelegation.toObject(includeInstance, f),
    entriesList: jspb.Message.toObjectList(msg.getEntriesList(),
    proto.cosmos.staking.v1beta1.RedelegationEntryResponse.toObject, includeInstance)
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
 * @return {!proto.cosmos.staking.v1beta1.RedelegationResponse}
 */
proto.cosmos.staking.v1beta1.RedelegationResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.staking.v1beta1.RedelegationResponse;
  return proto.cosmos.staking.v1beta1.RedelegationResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.staking.v1beta1.RedelegationResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.staking.v1beta1.RedelegationResponse}
 */
proto.cosmos.staking.v1beta1.RedelegationResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.staking.v1beta1.Redelegation;
      reader.readMessage(value,proto.cosmos.staking.v1beta1.Redelegation.deserializeBinaryFromReader);
      msg.setRedelegation(value);
      break;
    case 2:
      var value = new proto.cosmos.staking.v1beta1.RedelegationEntryResponse;
      reader.readMessage(value,proto.cosmos.staking.v1beta1.RedelegationEntryResponse.deserializeBinaryFromReader);
      msg.addEntries(value);
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
proto.cosmos.staking.v1beta1.RedelegationResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.staking.v1beta1.RedelegationResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.staking.v1beta1.RedelegationResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.staking.v1beta1.RedelegationResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRedelegation();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.staking.v1beta1.Redelegation.serializeBinaryToWriter
    );
  }
  f = message.getEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.staking.v1beta1.RedelegationEntryResponse.serializeBinaryToWriter
    );
  }
};


/**
 * optional Redelegation redelegation = 1;
 * @return {?proto.cosmos.staking.v1beta1.Redelegation}
 */
proto.cosmos.staking.v1beta1.RedelegationResponse.prototype.getRedelegation = function() {
  return /** @type{?proto.cosmos.staking.v1beta1.Redelegation} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.staking.v1beta1.Redelegation, 1));
};


/**
 * @param {?proto.cosmos.staking.v1beta1.Redelegation|undefined} value
 * @return {!proto.cosmos.staking.v1beta1.RedelegationResponse} returns this
*/
proto.cosmos.staking.v1beta1.RedelegationResponse.prototype.setRedelegation = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.staking.v1beta1.RedelegationResponse} returns this
 */
proto.cosmos.staking.v1beta1.RedelegationResponse.prototype.clearRedelegation = function() {
  return this.setRedelegation(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.staking.v1beta1.RedelegationResponse.prototype.hasRedelegation = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated RedelegationEntryResponse entries = 2;
 * @return {!Array<!proto.cosmos.staking.v1beta1.RedelegationEntryResponse>}
 */
proto.cosmos.staking.v1beta1.RedelegationResponse.prototype.getEntriesList = function() {
  return /** @type{!Array<!proto.cosmos.staking.v1beta1.RedelegationEntryResponse>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.staking.v1beta1.RedelegationEntryResponse, 2));
};


/**
 * @param {!Array<!proto.cosmos.staking.v1beta1.RedelegationEntryResponse>} value
 * @return {!proto.cosmos.staking.v1beta1.RedelegationResponse} returns this
*/
proto.cosmos.staking.v1beta1.RedelegationResponse.prototype.setEntriesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.staking.v1beta1.RedelegationEntryResponse=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.staking.v1beta1.RedelegationEntryResponse}
 */
proto.cosmos.staking.v1beta1.RedelegationResponse.prototype.addEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.staking.v1beta1.RedelegationEntryResponse, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.staking.v1beta1.RedelegationResponse} returns this
 */
proto.cosmos.staking.v1beta1.RedelegationResponse.prototype.clearEntriesList = function() {
  return this.setEntriesList([]);
};


