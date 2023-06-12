// source: rizon/treasury/params.proto
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

goog.provide('proto.rizonworld.rizon.treasury.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.rizonworld.rizon.treasury.Currency');

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
proto.rizonworld.rizon.treasury.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.rizonworld.rizon.treasury.Params.repeatedFields_, null);
};
goog.inherits(proto.rizonworld.rizon.treasury.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.rizonworld.rizon.treasury.Params.displayName = 'proto.rizonworld.rizon.treasury.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.rizonworld.rizon.treasury.Params.repeatedFields_ = [3];



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
proto.rizonworld.rizon.treasury.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.rizonworld.rizon.treasury.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.rizonworld.rizon.treasury.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.rizonworld.rizon.treasury.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    mintable: jspb.Message.getBooleanFieldWithDefault(msg, 1, false),
    sequence: jspb.Message.getFieldWithDefault(msg, 2, 0),
    currencyListList: jspb.Message.toObjectList(msg.getCurrencyListList(),
    proto.rizonworld.rizon.treasury.Currency.toObject, includeInstance)
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
 * @return {!proto.rizonworld.rizon.treasury.Params}
 */
proto.rizonworld.rizon.treasury.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.rizonworld.rizon.treasury.Params;
  return proto.rizonworld.rizon.treasury.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.rizonworld.rizon.treasury.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.rizonworld.rizon.treasury.Params}
 */
proto.rizonworld.rizon.treasury.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setMintable(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setSequence(value);
      break;
    case 3:
      var value = new proto.rizonworld.rizon.treasury.Currency;
      reader.readMessage(value,proto.rizonworld.rizon.treasury.Currency.deserializeBinaryFromReader);
      msg.addCurrencyList(value);
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
proto.rizonworld.rizon.treasury.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.rizonworld.rizon.treasury.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.rizonworld.rizon.treasury.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.rizonworld.rizon.treasury.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMintable();
  if (f) {
    writer.writeBool(
      1,
      f
    );
  }
  f = message.getSequence();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
  f = message.getCurrencyListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.rizonworld.rizon.treasury.Currency.serializeBinaryToWriter
    );
  }
};


/**
 * optional bool mintable = 1;
 * @return {boolean}
 */
proto.rizonworld.rizon.treasury.Params.prototype.getMintable = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 1, false));
};


/**
 * @param {boolean} value
 * @return {!proto.rizonworld.rizon.treasury.Params} returns this
 */
proto.rizonworld.rizon.treasury.Params.prototype.setMintable = function(value) {
  return jspb.Message.setProto3BooleanField(this, 1, value);
};


/**
 * optional int64 sequence = 2;
 * @return {number}
 */
proto.rizonworld.rizon.treasury.Params.prototype.getSequence = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.rizonworld.rizon.treasury.Params} returns this
 */
proto.rizonworld.rizon.treasury.Params.prototype.setSequence = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * repeated Currency currency_list = 3;
 * @return {!Array<!proto.rizonworld.rizon.treasury.Currency>}
 */
proto.rizonworld.rizon.treasury.Params.prototype.getCurrencyListList = function() {
  return /** @type{!Array<!proto.rizonworld.rizon.treasury.Currency>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.rizonworld.rizon.treasury.Currency, 3));
};


/**
 * @param {!Array<!proto.rizonworld.rizon.treasury.Currency>} value
 * @return {!proto.rizonworld.rizon.treasury.Params} returns this
*/
proto.rizonworld.rizon.treasury.Params.prototype.setCurrencyListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.rizonworld.rizon.treasury.Currency=} opt_value
 * @param {number=} opt_index
 * @return {!proto.rizonworld.rizon.treasury.Currency}
 */
proto.rizonworld.rizon.treasury.Params.prototype.addCurrencyList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.rizonworld.rizon.treasury.Currency, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.rizonworld.rizon.treasury.Params} returns this
 */
proto.rizonworld.rizon.treasury.Params.prototype.clearCurrencyListList = function() {
  return this.setCurrencyListList([]);
};


