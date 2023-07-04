// source: evmos/incentives/v1/incentives.proto
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

goog.provide('proto.evmos.incentives.v1.GasMeter');

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
proto.evmos.incentives.v1.GasMeter = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.evmos.incentives.v1.GasMeter, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.evmos.incentives.v1.GasMeter.displayName = 'proto.evmos.incentives.v1.GasMeter';
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
proto.evmos.incentives.v1.GasMeter.prototype.toObject = function(opt_includeInstance) {
  return proto.evmos.incentives.v1.GasMeter.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.evmos.incentives.v1.GasMeter} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.evmos.incentives.v1.GasMeter.toObject = function(includeInstance, msg) {
  var f, obj = {
    contract: jspb.Message.getFieldWithDefault(msg, 1, ""),
    participant: jspb.Message.getFieldWithDefault(msg, 2, ""),
    cumulativeGas: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.evmos.incentives.v1.GasMeter}
 */
proto.evmos.incentives.v1.GasMeter.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.evmos.incentives.v1.GasMeter;
  return proto.evmos.incentives.v1.GasMeter.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.evmos.incentives.v1.GasMeter} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.evmos.incentives.v1.GasMeter}
 */
proto.evmos.incentives.v1.GasMeter.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setContract(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setParticipant(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCumulativeGas(value);
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
proto.evmos.incentives.v1.GasMeter.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.evmos.incentives.v1.GasMeter.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.evmos.incentives.v1.GasMeter} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.evmos.incentives.v1.GasMeter.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContract();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getParticipant();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getCumulativeGas();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
};


/**
 * optional string contract = 1;
 * @return {string}
 */
proto.evmos.incentives.v1.GasMeter.prototype.getContract = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.evmos.incentives.v1.GasMeter} returns this
 */
proto.evmos.incentives.v1.GasMeter.prototype.setContract = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string participant = 2;
 * @return {string}
 */
proto.evmos.incentives.v1.GasMeter.prototype.getParticipant = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.evmos.incentives.v1.GasMeter} returns this
 */
proto.evmos.incentives.v1.GasMeter.prototype.setParticipant = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 cumulative_gas = 3;
 * @return {number}
 */
proto.evmos.incentives.v1.GasMeter.prototype.getCumulativeGas = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.evmos.incentives.v1.GasMeter} returns this
 */
proto.evmos.incentives.v1.GasMeter.prototype.setCumulativeGas = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};

