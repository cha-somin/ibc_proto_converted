// source: lum-network/icacallbacks/packet.proto
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

goog.provide('proto.lum.network.icacallbacks.IcacallbacksPacketData');
goog.provide('proto.lum.network.icacallbacks.IcacallbacksPacketData.PacketCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.lum.network.icacallbacks.NoData');

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
proto.lum.network.icacallbacks.IcacallbacksPacketData = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.lum.network.icacallbacks.IcacallbacksPacketData.oneofGroups_);
};
goog.inherits(proto.lum.network.icacallbacks.IcacallbacksPacketData, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.icacallbacks.IcacallbacksPacketData.displayName = 'proto.lum.network.icacallbacks.IcacallbacksPacketData';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.lum.network.icacallbacks.IcacallbacksPacketData.oneofGroups_ = [[1]];

/**
 * @enum {number}
 */
proto.lum.network.icacallbacks.IcacallbacksPacketData.PacketCase = {
  PACKET_NOT_SET: 0,
  NO_DATA: 1
};

/**
 * @return {proto.lum.network.icacallbacks.IcacallbacksPacketData.PacketCase}
 */
proto.lum.network.icacallbacks.IcacallbacksPacketData.prototype.getPacketCase = function() {
  return /** @type {proto.lum.network.icacallbacks.IcacallbacksPacketData.PacketCase} */(jspb.Message.computeOneofCase(this, proto.lum.network.icacallbacks.IcacallbacksPacketData.oneofGroups_[0]));
};



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
proto.lum.network.icacallbacks.IcacallbacksPacketData.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.icacallbacks.IcacallbacksPacketData.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.icacallbacks.IcacallbacksPacketData} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.icacallbacks.IcacallbacksPacketData.toObject = function(includeInstance, msg) {
  var f, obj = {
    noData: (f = msg.getNoData()) && proto.lum.network.icacallbacks.NoData.toObject(includeInstance, f)
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
 * @return {!proto.lum.network.icacallbacks.IcacallbacksPacketData}
 */
proto.lum.network.icacallbacks.IcacallbacksPacketData.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.icacallbacks.IcacallbacksPacketData;
  return proto.lum.network.icacallbacks.IcacallbacksPacketData.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.icacallbacks.IcacallbacksPacketData} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.icacallbacks.IcacallbacksPacketData}
 */
proto.lum.network.icacallbacks.IcacallbacksPacketData.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.lum.network.icacallbacks.NoData;
      reader.readMessage(value,proto.lum.network.icacallbacks.NoData.deserializeBinaryFromReader);
      msg.setNoData(value);
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
proto.lum.network.icacallbacks.IcacallbacksPacketData.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.icacallbacks.IcacallbacksPacketData.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.icacallbacks.IcacallbacksPacketData} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.icacallbacks.IcacallbacksPacketData.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getNoData();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.lum.network.icacallbacks.NoData.serializeBinaryToWriter
    );
  }
};


/**
 * optional NoData no_data = 1;
 * @return {?proto.lum.network.icacallbacks.NoData}
 */
proto.lum.network.icacallbacks.IcacallbacksPacketData.prototype.getNoData = function() {
  return /** @type{?proto.lum.network.icacallbacks.NoData} */ (
    jspb.Message.getWrapperField(this, proto.lum.network.icacallbacks.NoData, 1));
};


/**
 * @param {?proto.lum.network.icacallbacks.NoData|undefined} value
 * @return {!proto.lum.network.icacallbacks.IcacallbacksPacketData} returns this
*/
proto.lum.network.icacallbacks.IcacallbacksPacketData.prototype.setNoData = function(value) {
  return jspb.Message.setOneofWrapperField(this, 1, proto.lum.network.icacallbacks.IcacallbacksPacketData.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.icacallbacks.IcacallbacksPacketData} returns this
 */
proto.lum.network.icacallbacks.IcacallbacksPacketData.prototype.clearNoData = function() {
  return this.setNoData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.icacallbacks.IcacallbacksPacketData.prototype.hasNoData = function() {
  return jspb.Message.getField(this, 1) != null;
};

