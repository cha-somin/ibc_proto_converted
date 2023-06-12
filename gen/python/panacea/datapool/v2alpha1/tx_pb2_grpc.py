# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from panacea.datapool.v2alpha1 import tx_pb2 as panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreatePool = channel.unary_unary(
                '/panacea.datapool.v2alpha1.Msg/CreatePool',
                request_serializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgCreatePool.SerializeToString,
                response_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgCreatePoolResponse.FromString,
                )
        self.SellData = channel.unary_unary(
                '/panacea.datapool.v2alpha1.Msg/SellData',
                request_serializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgSellData.SerializeToString,
                response_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgSellDataResponse.FromString,
                )
        self.BuyDataPass = channel.unary_unary(
                '/panacea.datapool.v2alpha1.Msg/BuyDataPass',
                request_serializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgBuyDataPass.SerializeToString,
                response_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgBuyDataPassResponse.FromString,
                )
        self.RedeemDataPass = channel.unary_unary(
                '/panacea.datapool.v2alpha1.Msg/RedeemDataPass',
                request_serializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgRedeemDataPass.SerializeToString,
                response_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgRedeemDataPassResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def CreatePool(self, request, context):
        """CreatePool defines a method for creating data pool.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SellData(self, request, context):
        """SellData defines a method for selling data
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def BuyDataPass(self, request, context):
        """BuyDataPass defines a method for buying data pass
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RedeemDataPass(self, request, context):
        """RedeemDataPass defines a method for redeeming data pass to get data
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreatePool': grpc.unary_unary_rpc_method_handler(
                    servicer.CreatePool,
                    request_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgCreatePool.FromString,
                    response_serializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgCreatePoolResponse.SerializeToString,
            ),
            'SellData': grpc.unary_unary_rpc_method_handler(
                    servicer.SellData,
                    request_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgSellData.FromString,
                    response_serializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgSellDataResponse.SerializeToString,
            ),
            'BuyDataPass': grpc.unary_unary_rpc_method_handler(
                    servicer.BuyDataPass,
                    request_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgBuyDataPass.FromString,
                    response_serializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgBuyDataPassResponse.SerializeToString,
            ),
            'RedeemDataPass': grpc.unary_unary_rpc_method_handler(
                    servicer.RedeemDataPass,
                    request_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgRedeemDataPass.FromString,
                    response_serializer=panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgRedeemDataPassResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'panacea.datapool.v2alpha1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def CreatePool(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datapool.v2alpha1.Msg/CreatePool',
            panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgCreatePool.SerializeToString,
            panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgCreatePoolResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SellData(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datapool.v2alpha1.Msg/SellData',
            panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgSellData.SerializeToString,
            panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgSellDataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def BuyDataPass(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datapool.v2alpha1.Msg/BuyDataPass',
            panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgBuyDataPass.SerializeToString,
            panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgBuyDataPassResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RedeemDataPass(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datapool.v2alpha1.Msg/RedeemDataPass',
            panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgRedeemDataPass.SerializeToString,
            panacea_dot_datapool_dot_v2alpha1_dot_tx__pb2.MsgRedeemDataPassResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
