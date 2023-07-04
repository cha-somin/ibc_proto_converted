// source: sentinel/plan/v2/plan.proto
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

goog.provide('proto.sentinel.plan.v2.Plan');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.google.protobuf.Duration');
goog.require('proto.google.protobuf.Timestamp');

goog.forwardDeclare('proto.sentinel.types.v1.Status');
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
proto.sentinel.plan.v2.Plan = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.sentinel.plan.v2.Plan.repeatedFields_, null);
};
goog.inherits(proto.sentinel.plan.v2.Plan, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.sentinel.plan.v2.Plan.displayName = 'proto.sentinel.plan.v2.Plan';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.sentinel.plan.v2.Plan.repeatedFields_ = [5];



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
proto.sentinel.plan.v2.Plan.prototype.toObject = function(opt_includeInstance) {
  return proto.sentinel.plan.v2.Plan.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.sentinel.plan.v2.Plan} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.plan.v2.Plan.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    address: jspb.Message.getFieldWithDefault(msg, 2, ""),
    bytes: jspb.Message.getFieldWithDefault(msg, 3, ""),
    duration: (f = msg.getDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    pricesList: jspb.Message.toObjectList(msg.getPricesList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    status: jspb.Message.getFieldWithDefault(msg, 6, 0),
    statusAt: (f = msg.getStatusAt()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.sentinel.plan.v2.Plan}
 */
proto.sentinel.plan.v2.Plan.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.sentinel.plan.v2.Plan;
  return proto.sentinel.plan.v2.Plan.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.sentinel.plan.v2.Plan} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.sentinel.plan.v2.Plan}
 */
proto.sentinel.plan.v2.Plan.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setBytes(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setDuration(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addPrices(value);
      break;
    case 6:
      var value = /** @type {!proto.sentinel.types.v1.Status} */ (reader.readEnum());
      msg.setStatus(value);
      break;
    case 7:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStatusAt(value);
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
proto.sentinel.plan.v2.Plan.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.sentinel.plan.v2.Plan.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.sentinel.plan.v2.Plan} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.plan.v2.Plan.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getBytes();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getDuration();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getPricesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      6,
      f
    );
  }
  f = message.getStatusAt();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.sentinel.plan.v2.Plan.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.sentinel.plan.v2.Plan} returns this
 */
proto.sentinel.plan.v2.Plan.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string address = 2;
 * @return {string}
 */
proto.sentinel.plan.v2.Plan.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.sentinel.plan.v2.Plan} returns this
 */
proto.sentinel.plan.v2.Plan.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string bytes = 3;
 * @return {string}
 */
proto.sentinel.plan.v2.Plan.prototype.getBytes = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.sentinel.plan.v2.Plan} returns this
 */
proto.sentinel.plan.v2.Plan.prototype.setBytes = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional google.protobuf.Duration duration = 4;
 * @return {?proto.google.protobuf.Duration}
 */
proto.sentinel.plan.v2.Plan.prototype.getDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 4));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.sentinel.plan.v2.Plan} returns this
*/
proto.sentinel.plan.v2.Plan.prototype.setDuration = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.plan.v2.Plan} returns this
 */
proto.sentinel.plan.v2.Plan.prototype.clearDuration = function() {
  return this.setDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.plan.v2.Plan.prototype.hasDuration = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * repeated cosmos.base.v1beta1.Coin prices = 5;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.sentinel.plan.v2.Plan.prototype.getPricesList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.sentinel.plan.v2.Plan} returns this
*/
proto.sentinel.plan.v2.Plan.prototype.setPricesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.sentinel.plan.v2.Plan.prototype.addPrices = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.sentinel.plan.v2.Plan} returns this
 */
proto.sentinel.plan.v2.Plan.prototype.clearPricesList = function() {
  return this.setPricesList([]);
};


/**
 * optional sentinel.types.v1.Status status = 6;
 * @return {!proto.sentinel.types.v1.Status}
 */
proto.sentinel.plan.v2.Plan.prototype.getStatus = function() {
  return /** @type {!proto.sentinel.types.v1.Status} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {!proto.sentinel.types.v1.Status} value
 * @return {!proto.sentinel.plan.v2.Plan} returns this
 */
proto.sentinel.plan.v2.Plan.prototype.setStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 6, value);
};


/**
 * optional google.protobuf.Timestamp status_at = 7;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.sentinel.plan.v2.Plan.prototype.getStatusAt = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 7));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.sentinel.plan.v2.Plan} returns this
*/
proto.sentinel.plan.v2.Plan.prototype.setStatusAt = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.plan.v2.Plan} returns this
 */
proto.sentinel.plan.v2.Plan.prototype.clearStatusAt = function() {
  return this.setStatusAt(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.plan.v2.Plan.prototype.hasStatusAt = function() {
  return jspb.Message.getField(this, 7) != null;
};

