require 'vertx-hazelcast/distributed_object'
require 'vertx/util/utils.rb'
# Generated from io.vertx.hazelcast.IMap
module VertxHazelcast
  #  Hazelcast Map API
  class IMap < ::VertxHazelcast::DistributedObject
    # @private
    # @param j_del [::VertxHazelcast::IMap] the java delegate
    def initialize(j_del)
      super(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxHazelcast::IMap] the underlying java delegate
    def j_del
      @j_del
    end
    #  
    #  <p/>
    #  <p><b>Warning:</b></p>
    #  <p>
    #  This method returns a clone of the original value, so modifying the returned value does not change
    #  the actual value in the map. You should put the modified value back to make changes visible to all nodes.
    #  <pre>
    #       V value = map.get(key);
    #       value.updateSomeProperty();
    #       map.put(key, value);
    #  </pre>
    #  </p>
    #  <p/>
    #  <p><b>Warning-2:</b></p>
    #  This method uses <tt>hashCode</tt> and <tt>equals</tt> of the binary form of
    #  the <tt>key</tt>, not the actual implementations of <tt>hashCode</tt> and <tt>equals</tt>
    #  defined in the <tt>key</tt>'s class.
    #  <p/>
    # @param [Object] key 
    # @yield 
    # @return [self]
    def get(key=nil)
      if (key.class == String  || key.class == Hash || key.class == Array || key.class == NilClass || key.class == TrueClass || key.class == FalseClass || key.class == Fixnum || key.class == Float) && block_given?
        @j_del.java_method(:get, [Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(key),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.from_object(ar.result) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get(key)"
    end
    #  
    #  <p/>
    #  <p><b>Warning:</b></p>
    #  <p>
    #  This method returns a clone of the previous value, not the original (identically equal) value
    #  previously put into the map.
    #  </p>
    #  <p/>
    #  <p><b>Warning-2:</b></p>
    #  This method uses <tt>hashCode</tt> and <tt>equals</tt> of the binary form of
    #  the <tt>key</tt>, not the actual implementations of <tt>hashCode</tt> and <tt>equals</tt>
    #  defined in the <tt>key</tt>'s class.
    # @param [Object] key 
    # @param [Object] value 
    # @yield 
    # @return [self]
    def put(key=nil,value=nil)
      if (key.class == String  || key.class == Hash || key.class == Array || key.class == NilClass || key.class == TrueClass || key.class == FalseClass || key.class == Fixnum || key.class == Float) && (value.class == String  || value.class == Hash || value.class == Array || value.class == NilClass || value.class == TrueClass || value.class == FalseClass || value.class == Fixnum || value.class == Float) && block_given?
        @j_del.java_method(:put, [Java::java.lang.Object.java_class,Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(key),::Vertx::Util::Utils.to_object(value),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.from_object(ar.result) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling put(key,value)"
    end
    # @param [Object] key 
    # @param [Object] value 
    # @param [Fixnum] ttl 
    # @param [:NANOSECONDS,:MICROSECONDS,:MILLISECONDS,:SECONDS,:MINUTES,:HOURS,:DAYS] timeunit 
    # @yield 
    # @return [self]
    def put_async(key=nil,value=nil,ttl=nil,timeunit=nil)
      if (key.class == String  || key.class == Hash || key.class == Array || key.class == NilClass || key.class == TrueClass || key.class == FalseClass || key.class == Fixnum || key.class == Float) && (value.class == String  || value.class == Hash || value.class == Array || value.class == NilClass || value.class == TrueClass || value.class == FalseClass || value.class == Fixnum || value.class == Float) && ttl.class == Fixnum && timeunit.class == Symbol && block_given?
        @j_del.java_method(:putAsync, [Java::java.lang.Object.java_class,Java::java.lang.Object.java_class,Java::long.java_class,Java::JavaUtilConcurrent::TimeUnit.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(key),::Vertx::Util::Utils.to_object(value),ttl,Java::JavaUtilConcurrent::TimeUnit.valueOf(timeunit),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.from_object(ar.result) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling put_async(key,value,ttl,timeunit)"
    end
    # @param [Object] key 
    # @param [Object] value 
    # @param [Fixnum] ttl 
    # @param [:NANOSECONDS,:MICROSECONDS,:MILLISECONDS,:SECONDS,:MINUTES,:HOURS,:DAYS] timeunit 
    # @yield 
    # @return [self]
    def set_async(key=nil,value=nil,ttl=nil,timeunit=nil)
      if (key.class == String  || key.class == Hash || key.class == Array || key.class == NilClass || key.class == TrueClass || key.class == FalseClass || key.class == Fixnum || key.class == Float) && (value.class == String  || value.class == Hash || value.class == Array || value.class == NilClass || value.class == TrueClass || value.class == FalseClass || value.class == Fixnum || value.class == Float) && block_given? && ttl == nil && timeunit == nil
        @j_del.java_method(:setAsync, [Java::java.lang.Object.java_class,Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(key),::Vertx::Util::Utils.to_object(value),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      elsif (key.class == String  || key.class == Hash || key.class == Array || key.class == NilClass || key.class == TrueClass || key.class == FalseClass || key.class == Fixnum || key.class == Float) && (value.class == String  || value.class == Hash || value.class == Array || value.class == NilClass || value.class == TrueClass || value.class == FalseClass || value.class == Fixnum || value.class == Float) && ttl.class == Fixnum && timeunit.class == Symbol && block_given?
        @j_del.java_method(:setAsync, [Java::java.lang.Object.java_class,Java::java.lang.Object.java_class,Java::long.java_class,Java::JavaUtilConcurrent::TimeUnit.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(key),::Vertx::Util::Utils.to_object(value),ttl,Java::JavaUtilConcurrent::TimeUnit.valueOf(timeunit),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling set_async(key,value,ttl,timeunit)"
    end
    #  
    #  <p/>
    #  <p><b>Warning:</b></p>
    #  <p>
    #  This method uses <tt>hashCode</tt> and <tt>equals</tt> of the binary form of
    #  the <tt>key</tt>, not the actual implementations of <tt>hashCode</tt> and <tt>equals</tt>
    #  defined in the <tt>key</tt>'s class.
    #  </p>
    #  <p/>
    #  <p><b>Warning-2:</b></p>
    #  <p>
    #  This method returns a clone of the previous value, not the original (identically equal) value
    #  previously put into the map.
    #  </p>
    # @param [Object] key 
    # @yield 
    # @return [self]
    def remove(key=nil)
      if (key.class == String  || key.class == Hash || key.class == Array || key.class == NilClass || key.class == TrueClass || key.class == FalseClass || key.class == Fixnum || key.class == Float) && block_given?
        @j_del.java_method(:remove, [Java::java.lang.Object.java_class,Java::IoVertxCore::Handler.java_class]).call(::Vertx::Util::Utils.to_object(key),(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.from_object(ar.result) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling remove(key)"
    end
  end
end
