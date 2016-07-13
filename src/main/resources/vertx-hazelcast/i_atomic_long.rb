require 'vertx-hazelcast/distributed_object'
require 'vertx/util/utils.rb'
# Generated from io.vertx.hazelcast.IAtomicLong
module VertxHazelcast
  #  A proxy for IAtomicLong
  class IAtomicLong < ::VertxHazelcast::DistributedObject
    # @private
    # @param j_del [::VertxHazelcast::IAtomicLong] the java delegate
    def initialize(j_del)
      super(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxHazelcast::IAtomicLong] the underlying java delegate
    def j_del
      @j_del
    end
    # @param [Fixnum] delta 
    # @yield 
    # @return [self]
    def add_and_get(delta=nil)
      if delta.class == Fixnum && block_given?
        @j_del.java_method(:addAndGet, [Java::long.java_class,Java::IoVertxCore::Handler.java_class]).call(delta,(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling add_and_get(delta)"
    end
    # @param [Fixnum] expect 
    # @param [Fixnum] update 
    # @yield 
    # @return [self]
    def compare_and_set(expect=nil,update=nil)
      if expect.class == Fixnum && update.class == Fixnum && block_given?
        @j_del.java_method(:compareAndSet, [Java::long.java_class,Java::long.java_class,Java::IoVertxCore::Handler.java_class]).call(expect,update,(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling compare_and_set(expect,update)"
    end
    # @yield 
    # @return [self]
    def decrement_and_get
      if block_given?
        @j_del.java_method(:decrementAndGet, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling decrement_and_get()"
    end
    # @yield 
    # @return [self]
    def get
      if block_given?
        @j_del.java_method(:get, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get()"
    end
    # @param [Fixnum] delta 
    # @yield 
    # @return [self]
    def get_and_add(delta=nil)
      if delta.class == Fixnum && block_given?
        @j_del.java_method(:getAndAdd, [Java::long.java_class,Java::IoVertxCore::Handler.java_class]).call(delta,(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_and_add(delta)"
    end
    # @param [Fixnum] newValue 
    # @yield 
    # @return [self]
    def get_and_set(newValue=nil)
      if newValue.class == Fixnum && block_given?
        @j_del.java_method(:getAndSet, [Java::long.java_class,Java::IoVertxCore::Handler.java_class]).call(newValue,(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_and_set(newValue)"
    end
    # @yield 
    # @return [self]
    def increment_and_get
      if block_given?
        @j_del.java_method(:incrementAndGet, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling increment_and_get()"
    end
    # @yield 
    # @return [self]
    def get_and_increment
      if block_given?
        @j_del.java_method(:getAndIncrement, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ar.result : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_and_increment()"
    end
    # @param [Fixnum] newValue 
    # @yield 
    # @return [self]
    def set(newValue=nil)
      if newValue.class == Fixnum && block_given?
        @j_del.java_method(:set, [Java::long.java_class,Java::IoVertxCore::Handler.java_class]).call(newValue,(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling set(newValue)"
    end
  end
end
