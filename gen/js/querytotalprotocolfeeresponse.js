// source: stafihub/ledger/query.proto
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

goog.provide('proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.ledger.TotalProtocolFee');

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
proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.repeatedFields_, null);
};
goog.inherits(proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.displayName = 'proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.repeatedFields_ = [1];



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
proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    totalprotocolfeelistList: jspb.Message.toObjectList(msg.getTotalprotocolfeelistList(),
    proto.stafihub.stafihub.ledger.TotalProtocolFee.toObject, includeInstance)
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
 * @return {!proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse}
 */
proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse;
  return proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse}
 */
proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stafihub.stafihub.ledger.TotalProtocolFee;
      reader.readMessage(value,proto.stafihub.stafihub.ledger.TotalProtocolFee.deserializeBinaryFromReader);
      msg.addTotalprotocolfeelist(value);
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
proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTotalprotocolfeelistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.stafihub.stafihub.ledger.TotalProtocolFee.serializeBinaryToWriter
    );
  }
};


/**
 * repeated TotalProtocolFee totalProtocolFeeList = 1;
 * @return {!Array<!proto.stafihub.stafihub.ledger.TotalProtocolFee>}
 */
proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.prototype.getTotalprotocolfeelistList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.ledger.TotalProtocolFee>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.ledger.TotalProtocolFee, 1));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.ledger.TotalProtocolFee>} value
 * @return {!proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse} returns this
*/
proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.prototype.setTotalprotocolfeelistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.stafihub.stafihub.ledger.TotalProtocolFee=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.ledger.TotalProtocolFee}
 */
proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.prototype.addTotalprotocolfeelist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.stafihub.stafihub.ledger.TotalProtocolFee, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse} returns this
 */
proto.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.prototype.clearTotalprotocolfeelistList = function() {
  return this.setTotalprotocolfeelistList([]);
};


