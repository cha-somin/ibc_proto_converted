// source: axelar/multisig/v1beta1/query.proto
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

goog.provide('proto.axelar.multisig.v1beta1.KeygenSessionResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.multisig.v1beta1.KeygenParticipant');
goog.require('proto.google.protobuf.Timestamp');

goog.forwardDeclare('proto.axelar.multisig.exported.v1beta1.MultisigState');
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
proto.axelar.multisig.v1beta1.KeygenSessionResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.multisig.v1beta1.KeygenSessionResponse.repeatedFields_, null);
};
goog.inherits(proto.axelar.multisig.v1beta1.KeygenSessionResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.multisig.v1beta1.KeygenSessionResponse.displayName = 'proto.axelar.multisig.v1beta1.KeygenSessionResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.repeatedFields_ = [10];



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
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.multisig.v1beta1.KeygenSessionResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    startedAt: jspb.Message.getFieldWithDefault(msg, 1, 0),
    startedAtTimestamp: (f = msg.getStartedAtTimestamp()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    expiresAt: jspb.Message.getFieldWithDefault(msg, 3, 0),
    completedAt: jspb.Message.getFieldWithDefault(msg, 4, 0),
    gracePeriod: jspb.Message.getFieldWithDefault(msg, 5, 0),
    state: jspb.Message.getFieldWithDefault(msg, 6, 0),
    keygenThresholdWeight: msg.getKeygenThresholdWeight_asB64(),
    signingThresholdWeight: msg.getSigningThresholdWeight_asB64(),
    bondedWeight: msg.getBondedWeight_asB64(),
    participantsList: jspb.Message.toObjectList(msg.getParticipantsList(),
    proto.axelar.multisig.v1beta1.KeygenParticipant.toObject, includeInstance)
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
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.multisig.v1beta1.KeygenSessionResponse;
  return proto.axelar.multisig.v1beta1.KeygenSessionResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setStartedAt(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartedAtTimestamp(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setExpiresAt(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setCompletedAt(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setGracePeriod(value);
      break;
    case 6:
      var value = /** @type {!proto.axelar.multisig.exported.v1beta1.MultisigState} */ (reader.readEnum());
      msg.setState(value);
      break;
    case 7:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setKeygenThresholdWeight(value);
      break;
    case 8:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSigningThresholdWeight(value);
      break;
    case 9:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setBondedWeight(value);
      break;
    case 10:
      var value = new proto.axelar.multisig.v1beta1.KeygenParticipant;
      reader.readMessage(value,proto.axelar.multisig.v1beta1.KeygenParticipant.deserializeBinaryFromReader);
      msg.addParticipants(value);
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
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.multisig.v1beta1.KeygenSessionResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getStartedAt();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getStartedAtTimestamp();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getExpiresAt();
  if (f !== 0) {
    writer.writeInt64(
      3,
      f
    );
  }
  f = message.getCompletedAt();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
  f = message.getGracePeriod();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getState();
  if (f !== 0.0) {
    writer.writeEnum(
      6,
      f
    );
  }
  f = message.getKeygenThresholdWeight_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      7,
      f
    );
  }
  f = message.getSigningThresholdWeight_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      8,
      f
    );
  }
  f = message.getBondedWeight_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      9,
      f
    );
  }
  f = message.getParticipantsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      10,
      f,
      proto.axelar.multisig.v1beta1.KeygenParticipant.serializeBinaryToWriter
    );
  }
};


/**
 * optional int64 started_at = 1;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getStartedAt = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.setStartedAt = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional google.protobuf.Timestamp started_at_timestamp = 2;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getStartedAtTimestamp = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 2));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} returns this
*/
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.setStartedAtTimestamp = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.clearStartedAtTimestamp = function() {
  return this.setStartedAtTimestamp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.hasStartedAtTimestamp = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional int64 expires_at = 3;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getExpiresAt = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.setExpiresAt = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional int64 completed_at = 4;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getCompletedAt = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.setCompletedAt = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional int64 grace_period = 5;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getGracePeriod = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.setGracePeriod = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional axelar.multisig.exported.v1beta1.MultisigState state = 6;
 * @return {!proto.axelar.multisig.exported.v1beta1.MultisigState}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getState = function() {
  return /** @type {!proto.axelar.multisig.exported.v1beta1.MultisigState} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {!proto.axelar.multisig.exported.v1beta1.MultisigState} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.setState = function(value) {
  return jspb.Message.setProto3EnumField(this, 6, value);
};


/**
 * optional bytes keygen_threshold_weight = 7;
 * @return {string}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getKeygenThresholdWeight = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * optional bytes keygen_threshold_weight = 7;
 * This is a type-conversion wrapper around `getKeygenThresholdWeight()`
 * @return {string}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getKeygenThresholdWeight_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getKeygenThresholdWeight()));
};


/**
 * optional bytes keygen_threshold_weight = 7;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getKeygenThresholdWeight()`
 * @return {!Uint8Array}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getKeygenThresholdWeight_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getKeygenThresholdWeight()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.setKeygenThresholdWeight = function(value) {
  return jspb.Message.setProto3BytesField(this, 7, value);
};


/**
 * optional bytes signing_threshold_weight = 8;
 * @return {string}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getSigningThresholdWeight = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * optional bytes signing_threshold_weight = 8;
 * This is a type-conversion wrapper around `getSigningThresholdWeight()`
 * @return {string}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getSigningThresholdWeight_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSigningThresholdWeight()));
};


/**
 * optional bytes signing_threshold_weight = 8;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSigningThresholdWeight()`
 * @return {!Uint8Array}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getSigningThresholdWeight_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSigningThresholdWeight()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.setSigningThresholdWeight = function(value) {
  return jspb.Message.setProto3BytesField(this, 8, value);
};


/**
 * optional bytes bonded_weight = 9;
 * @return {string}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getBondedWeight = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * optional bytes bonded_weight = 9;
 * This is a type-conversion wrapper around `getBondedWeight()`
 * @return {string}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getBondedWeight_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getBondedWeight()));
};


/**
 * optional bytes bonded_weight = 9;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getBondedWeight()`
 * @return {!Uint8Array}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getBondedWeight_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getBondedWeight()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.setBondedWeight = function(value) {
  return jspb.Message.setProto3BytesField(this, 9, value);
};


/**
 * repeated KeygenParticipant participants = 10;
 * @return {!Array<!proto.axelar.multisig.v1beta1.KeygenParticipant>}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.getParticipantsList = function() {
  return /** @type{!Array<!proto.axelar.multisig.v1beta1.KeygenParticipant>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.multisig.v1beta1.KeygenParticipant, 10));
};


/**
 * @param {!Array<!proto.axelar.multisig.v1beta1.KeygenParticipant>} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} returns this
*/
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.setParticipantsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 10, value);
};


/**
 * @param {!proto.axelar.multisig.v1beta1.KeygenParticipant=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.multisig.v1beta1.KeygenParticipant}
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.addParticipants = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 10, opt_value, proto.axelar.multisig.v1beta1.KeygenParticipant, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.multisig.v1beta1.KeygenSessionResponse} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSessionResponse.prototype.clearParticipantsList = function() {
  return this.setParticipantsList([]);
};

