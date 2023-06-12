// source: umee/incentive/v1/incentive.proto
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

goog.provide('proto.umee.incentive.v1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.umee.incentive.v1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.umee.incentive.v1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.umee.incentive.v1.Params.displayName = 'proto.umee.incentive.v1.Params';
}



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
proto.umee.incentive.v1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.umee.incentive.v1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.umee.incentive.v1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.incentive.v1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    maxUnbondings: jspb.Message.getFieldWithDefault(msg, 1, 0),
    unbondingDuration: jspb.Message.getFieldWithDefault(msg, 2, 0),
    emergencyUnbondFee: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.umee.incentive.v1.Params}
 */
proto.umee.incentive.v1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.umee.incentive.v1.Params;
  return proto.umee.incentive.v1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.umee.incentive.v1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.umee.incentive.v1.Params}
 */
proto.umee.incentive.v1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setMaxUnbondings(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setUnbondingDuration(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setEmergencyUnbondFee(value);
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
proto.umee.incentive.v1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.umee.incentive.v1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.umee.incentive.v1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.incentive.v1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMaxUnbondings();
  if (f !== 0) {
    writer.writeUint32(
      1,
      f
    );
  }
  f = message.getUnbondingDuration();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
  f = message.getEmergencyUnbondFee();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional uint32 max_unbondings = 1;
 * @return {number}
 */
proto.umee.incentive.v1.Params.prototype.getMaxUnbondings = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.umee.incentive.v1.Params} returns this
 */
proto.umee.incentive.v1.Params.prototype.setMaxUnbondings = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional int64 unbonding_duration = 2;
 * @return {number}
 */
proto.umee.incentive.v1.Params.prototype.getUnbondingDuration = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.umee.incentive.v1.Params} returns this
 */
proto.umee.incentive.v1.Params.prototype.setUnbondingDuration = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string emergency_unbond_fee = 3;
 * @return {string}
 */
proto.umee.incentive.v1.Params.prototype.getEmergencyUnbondFee = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.incentive.v1.Params} returns this
 */
proto.umee.incentive.v1.Params.prototype.setEmergencyUnbondFee = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


