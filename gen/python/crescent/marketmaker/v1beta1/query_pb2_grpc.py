# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from crescent.marketmaker.v1beta1 import query_pb2 as crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC query service for the marketmaker module.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/crescent.marketmaker.v1beta1.Query/Params',
                request_serializer=crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.MarketMakers = channel.unary_unary(
                '/crescent.marketmaker.v1beta1.Query/MarketMakers',
                request_serializer=crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryMarketMakersRequest.SerializeToString,
                response_deserializer=crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryMarketMakersResponse.FromString,
                )
        self.Incentive = channel.unary_unary(
                '/crescent.marketmaker.v1beta1.Query/Incentive',
                request_serializer=crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryIncentiveRequest.SerializeToString,
                response_deserializer=crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryIncentiveResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC query service for the marketmaker module.
    """

    def Params(self, request, context):
        """Params returns parameters of the marketmaker module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MarketMakers(self, request, context):
        """MarketMakers returns all market makers.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Incentive(self, request, context):
        """Incentive returns a specific incentive.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'MarketMakers': grpc.unary_unary_rpc_method_handler(
                    servicer.MarketMakers,
                    request_deserializer=crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryMarketMakersRequest.FromString,
                    response_serializer=crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryMarketMakersResponse.SerializeToString,
            ),
            'Incentive': grpc.unary_unary_rpc_method_handler(
                    servicer.Incentive,
                    request_deserializer=crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryIncentiveRequest.FromString,
                    response_serializer=crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryIncentiveResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'crescent.marketmaker.v1beta1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC query service for the marketmaker module.
    """

    @staticmethod
    def Params(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.marketmaker.v1beta1.Query/Params',
            crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MarketMakers(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.marketmaker.v1beta1.Query/MarketMakers',
            crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryMarketMakersRequest.SerializeToString,
            crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryMarketMakersResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Incentive(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.marketmaker.v1beta1.Query/Incentive',
            crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryIncentiveRequest.SerializeToString,
            crescent_dot_marketmaker_dot_v1beta1_dot_query__pb2.QueryIncentiveResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
